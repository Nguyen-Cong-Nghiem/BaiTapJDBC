package view;

import model.Category;

import java.sql.SQLException;
import java.util.List;

public interface CategoryService {
    List<Category> findAll() throws SQLException;

    void save(Category category) throws SQLException;

    Category findById(int id) throws SQLException;

    void update(int id, Category category) throws SQLException;

    void remove(int id, Category category) throws SQLException;

    Category findByName(String name) throws SQLException;
}
