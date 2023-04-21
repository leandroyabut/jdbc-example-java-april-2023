package com.smoothstack.jdbcapr2023.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager implements AutoCloseable {

    private static final String jdbcUrl = System.getenv("JDBC_URL");
    private static final String username = System.getenv("DB_USERNAME");
    private static final String password = System.getenv("DB_PASSWORD");

    private Connection connection;

    public Connection getConnection() {
        if (connection != null)
            return connection;

        try {
            System.out.printf("Getting connection to %s%n", jdbcUrl);
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            if (!connection.isValid(0)) {
                System.err.println("Connection is invalid.");
            }
        } catch (SQLException e) {
            System.err.println("Unable to get a valid connection.");
            System.err.println(e.getMessage());
        }

        return connection;
    }

    @Override
    public void close() {
        if (connection == null)
            return;
        try {
            connection.close();
            connection = null;
        } catch (SQLException e) {
            System.err.println("Unable to properly close connection.");
            System.err.println(e.getMessage());
        }
    }
}
