package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        HttpSession session = request.getSession();
        if (username.equals("nghiem") && password.equals("nghiem")) {
            Cookie user = new Cookie("user", "nghiem");
            Cookie pass = new Cookie("pass", "nghiem");
            if (request.getParameter("check") != null) {
                user.setMaxAge(90 * 100 * 90);
                pass.setMaxAge(90 * 100 * 90);
            } else {
                user.setMaxAge(0);
                pass.setMaxAge(0);
            }
            response.addCookie(user);
            response.addCookie(pass);
            session.setAttribute("username", username);
            response.sendRedirect("/categories");
        } else {
            request.setAttribute("error", "Nhap sai roi");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
            dispatcher.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
