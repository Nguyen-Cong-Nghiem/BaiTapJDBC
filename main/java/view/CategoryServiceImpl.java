package view;

import model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<Category> findAll() throws SQLException {
        Connectioned connectioned = new Connectioned();
        Connection connection = connectioned.connection();
        String sql = "Select * from category";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Category> categories = new ArrayList<>();
        while (resultSet.next()) {
            Category category = new Category();
            category.setId(resultSet.getInt("id"));
            category.setName(resultSet.getString("name"));
            categories.add(category);
        }

        preparedStatement.close();
        connection.close();
        return categories;
    }

    @Override
    public void save(Category category) throws SQLException {
        Connectioned connectioned = new Connectioned();
        Connection connection = connectioned.connection();
        String sql = "insert into category values (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, category.getId());
        preparedStatement.setString(2, category.getName());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }

    @Override
    public Category findByName(String name) throws SQLException {
        Connectioned connectioned = new Connectioned();
        Connection connection = connectioned.connection();
        String sql = "select * from category where name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        Category category = new Category();
        while (resultSet.next()) {
            category.setId(resultSet.getInt("id"));
            category.setName(resultSet.getString("name"));
        }
        preparedStatement.close();
        connection.close();
        return category;
    }

    @Override
    public Category findById(int id) throws SQLException {
        Connectioned connectioned = new Connectioned();
        Connection connection = connectioned.connection();
        String sql = "select * from category where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Category category = new Category();
        while (resultSet.next()) {
            category.setId(resultSet.getInt("id"));
            category.setName(resultSet.getString("name"));
        }
        preparedStatement.close();
        connection.close();
        return category;
    }

    @Override
    public void update(int id, Category category) throws SQLException {
        Connectioned connectioned = new Connectioned();
        Connection connection = connectioned.connection();
        String sql = "update category set id = ? , name = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, category.getId());
        preparedStatement.setString(2, category.getName());
        preparedStatement.setInt(3, id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }

    @Override
    public void remove(int id, Category category) throws SQLException {
        Connectioned connectioned = new Connectioned();
        Connection connection = connectioned.connection();
        String sql = "delete from category where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
}
