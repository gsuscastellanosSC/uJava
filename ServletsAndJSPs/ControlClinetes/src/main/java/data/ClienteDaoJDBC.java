package data;

import domain.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoJDBC {
    
    private static final String SQL_SELECT = "SELECT id_cliente, nombre, apellidos, email, telefono, saldo"
            + "FROM cliente";
    private static final String SQL_SELECT_BY_ID = "SELECT id_cliente, nombre, apellidos, email, telefono, saldo"
            + "FROM cliente WHERE id_cliente=?";
    private static final String SQL_INSERT = "INSERT INTO cliente(nombre, apellidos, email, telefono, saldo)"
            + "VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE cliente " + "SET nombre=?, apellidos=?, email=?, telefono=?, saldo=? WHERE id_cliente=?";
    
    private static final String SQL_DELETE = "DELETE FROM cliente WHERE id_cliente=?";
    
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
            ConnectionBD.Close(connection);
        }
        return clientes;
    }
}
