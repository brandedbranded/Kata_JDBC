package jm.task.core.jdbc.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    private String userName = "root";
    private String password = "1234";
    private String connectionUrl = "jdbc:mysql://localhost:3306/kata";

    public Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionUrl, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}

