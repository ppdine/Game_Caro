package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Data Access Object (DatabaseConnection) class for database connection
 */
public class DatabaseConnection {
    protected Connection dbConnection;

    public DatabaseConnection() {
        final String DATABASE_NAME = "dbcaro";
        final String jdbcURL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME + "?useSSL=false";
        final String JDBC_USER = "root";
        final String JDBC_PASSWORD = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            dbConnection = DriverManager.getConnection(jdbcURL, JDBC_USER, JDBC_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection to database failed");
        }
    }
}