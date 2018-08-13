package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectioned {
    private String JDBC = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/awesomebusiness";
    private String user = "root";
    private String pass = "Nghi3mgi4n";

    Connection connection = null;

    public Connection connection() {
        try {
            Class.forName(JDBC);
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
