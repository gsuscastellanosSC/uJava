package data;

import domain.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoJDBC {

    private static final String SQL_SELECT = "SELECT id_cliente, nombre, apellido, email, telefono, saldo "
            + " FROM cliente";

    private static final String SQL_SELECT_BY_ID = "SELECT id_cliente, nombre, apellido, email, telefono, saldo "
            + " FROM cliente WHERE id_cliente = ?";

    private static final String SQL_INSERT = "INSERT INTO cliente(nombre, apellido, email, telefono, saldo) "
            + " VALUES(?, ?, ?, ?, ?)";

    private static final String SQL_UPDATE = "UPDATE cliente "
            + " SET nombre=?, apellido=?, email=?, telefono=?, saldo=? WHERE id_cliente=?";

    private static final String SQL_DELETE = "DELETE FROM cliente WHERE id_cliente = ?";

    public List<Cliente> listar() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Cliente cliente = null;
        List<Cliente> clientes = new ArrayList<>();
        try {
            connection = ConnectionBD.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idCliente = resultSet.getInt("id_cliente");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String email = resultSet.getString("email");
                String telefono = resultSet.getString("telefono");
                double saldo = resultSet.getDouble("saldo");
                cliente = new Cliente(idCliente, nombre, apellido, email, telefono, saldo);
                clientes.add(cliente);
            }
        } catch (SQLException sQLException) {
            sQLException.printStackTrace(System.out);
        } finally {
            ConnectionBD.close(resultSet);
            ConnectionBD.close(preparedStatement);
            ConnectionBD.close(connection);
        }
        return clientes;
    }

    public Cliente findToClient(Cliente cliente) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = ConnectionBD.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT_BY_ID);
            preparedStatement.setInt(1, cliente.getIdCliente());
            resultSet = preparedStatement.executeQuery();
            resultSet.absolute(1);//Primer elemento
            String nombre = resultSet.getString("nombre");
            String apellido = resultSet.getString("apellido");
            String email = resultSet.getString("email");
            String telefono = resultSet.getString("telefono");
            double saldo = resultSet.getDouble("saldo");

            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setEmail(email);
            cliente.setTelefono(telefono);
            cliente.setSaldo(saldo);
        } catch (SQLException sQLException) {
            sQLException.printStackTrace(System.out);
        } finally {
            ConnectionBD.close(resultSet);
            ConnectionBD.close(preparedStatement);
            ConnectionBD.close(connection);
        }
        return cliente;
    }

    public int insertar(Cliente cliente) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int rows = 0;
        try {
            connection = ConnectionBD.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getApellido());
            preparedStatement.setString(3, cliente.getEmail());
            preparedStatement.setString(4, cliente.getTelefono());
            preparedStatement.setDouble(5, cliente.getSaldo());
            rows = preparedStatement.executeUpdate();
        } catch (SQLException sQLException) {
            sQLException.printStackTrace(System.out);
        } finally {
            ConnectionBD.close(preparedStatement);
            ConnectionBD.close(connection);
        }
        return rows;
    }

    public int update(Cliente cliente) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int rows = 0;
        try {
            connection = ConnectionBD.getConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE);
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getApellido());
            preparedStatement.setString(3, cliente.getEmail());
            preparedStatement.setString(4, cliente.getTelefono());
            preparedStatement.setDouble(5, cliente.getSaldo());
            preparedStatement.setInt(6, cliente.getIdCliente());
            rows = preparedStatement.executeUpdate();
        } catch (SQLException sQLException) {
            sQLException.printStackTrace(System.out);
        } finally {
            ConnectionBD.close(preparedStatement);
            ConnectionBD.close(connection);
        }
        return rows;
    }

    public int delete(Cliente cliente) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int rows = 0;
        try {
            connection = ConnectionBD.getConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE);
            preparedStatement.setInt(1, cliente.getIdCliente());

            rows = preparedStatement.executeUpdate();
        } catch (SQLException sQLException) {
            sQLException.printStackTrace(System.out);
        } finally {
            ConnectionBD.close(preparedStatement);
            ConnectionBD.close(connection);
        }
        return rows;
    }
}
