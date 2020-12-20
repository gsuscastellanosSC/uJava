/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import static data.ConnectionClass.getConnection;
import domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SC
 */
public class UserDAO {

    private static final String SQL_SELECT = "SELECT id_user, user_name, password FROM test.user";
    private static final String SQL_INSERT = "INSERT INTO test.user (user_name, password) VALUES (?, ?)";
    private static final String SQL_DELETE = "DELETE FROM test.user WHERE id_user = ?";
    private static final String SQL_UPDATE = "UPDATE test.user SET user_name = ?, password = ? WHERE id_user = ?";

    public List<User> select() {
        List<User> users = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                users.add(new User(resultSet.getInt("id_user"), resultSet.getString("user_name"), resultSet.getString("password")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                ConnectionClass.close(resultSet);
                ConnectionClass.close(preparedStatement);
                ConnectionClass.close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return users;
    }

    public int insert(User user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int records = 0;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            records = preparedStatement.executeUpdate();
            System.out.println(((records == 1) ? "Se inserto: " : "Se insertaron: ") + records + ((records == 1) ? " registro" : " registros"));
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                ConnectionClass.close(preparedStatement);
                ConnectionClass.close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return records;
    }

    public int delete(User user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int records = 0;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE);
            preparedStatement.setInt(1, user.getIdUser());
            records = preparedStatement.executeUpdate();
            System.out.println(((records == 1) ? "Se elimino: " : "Se eliminaron: ") + records + ((records == 1) ? " registro" : " registros"));
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                ConnectionClass.close(preparedStatement);
                ConnectionClass.close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return records;
    }

    public int update(User user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int records = 0;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setInt(3, user.getIdUser());
            records = preparedStatement.executeUpdate();
            System.out.println(((records == 1) ? "Se actualizo: " : "Se actualizaron: ") + records + ((records == 1) ? " registro" : " registros"));
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                ConnectionClass.close(preparedStatement);
                ConnectionClass.close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return records;
    }
}
