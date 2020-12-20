/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SC
 */
public class ConnectionClass {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    public static void close(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }

    public static void close(Statement statement) throws SQLException {
        statement.close();
    }

    public static void close(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    public static void close(Connection connection) throws SQLException {
        connection.close();
    }
}
