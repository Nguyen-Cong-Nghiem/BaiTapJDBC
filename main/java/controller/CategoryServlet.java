package controller;

import model.Category;
import view.CategoryService;
import view.CategoryServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CategoryServlet", urlPatterns = "/categories")
public class CategoryServlet extends HttpServlet {
    private CategoryService categoryService = new CategoryServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                updateProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                searchProduct(request, response);
                break;
        }
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");

        try {
            Category category = categoryService.findByName(name);
            RequestDispatcher dispatcher;
            if (category == null) {
                dispatcher = request.getRequestDispatcher("/error.jsp");
            } else {
                request.setAttribute("view", category);
                dispatcher = request.getRequestDispatcher("/view.jsp");
            }
            dispatcher.forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            Category category = categoryService.findById(id);
            categoryService.remove(id, category);
            response.sendRedirect("/categories");
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        try {
            Category category = categoryService.findById(id);
            category.setId(id);
            category.setName(name);
            categoryService.update(id, category);
            request.setAttribute("message","Cap nhat thanh cong");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/edit.jsp");
            requestDispatcher.forward(request, response);
        } catch (SQLException | IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Category category = new Category(id, name);
        try {
            categoryService.save(category);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("create","Create thanh cong");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showUpdateForm(request, response);
                break;
            case "delete":
                showDeleteForm(request, response);
                break;
            case "view":
                showViewProduct(request, response);
                break;
//            case "search":
//                showSearchProduct(request, response);
            default:
                showList(request, response);
                break;
        }
    }

//    private void showSearchProduct(HttpServletRequest request, HttpServletResponse response) {
//        RequestDispatcher dispatcher;
//        dispatcher = request.getRequestDispatcher("/search.jsp");
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//    }

    private void showViewProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            Category category = categoryService.findById(id);
            RequestDispatcher requestDispatcher;
            if (category == null) {
                requestDispatcher = request.getRequestDispatcher("/error-404.jsp");
            } else {
                request.setAttribute("view", category);
                requestDispatcher = request.getRequestDispatcher("/view.jsp");
                requestDispatcher.forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            Category category = categoryService.findById(id);
            RequestDispatcher requestDispatcher;
            if (category == null) {
                requestDispatcher = request.getRequestDispatcher("/error-404.jsp");
            } else {
                request.setAttribute("delete", category);
                requestDispatcher = request.getRequestDispatcher("/delete.jsp");
                requestDispatcher.forward(request, response);
            }
        } catch (SQLException | ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Category category = categoryService.findById(id);
            request.setAttribute("edit", category);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/edit.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
        try {
            List<Category> categoryList = categoryService.findAll();
            request.setAttribute("show", categoryList);
            dispatcher.forward(request, response);
        } catch (SQLException | ServletException | IOException e) {
            e.printStackTrace();
        }
    }


}
