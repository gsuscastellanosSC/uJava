package data;

import static data.ConnectionClass.getConnection;
import domain.Person;
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
public class PersonDAO {

    private static final String SQL_SELECT = "SELECT id_person, name, lastName, mail, phone FROM person";
    private static final String SQL_INSERT = "INSERT INTO test.person (name, lastName, mail, phone) VALUES (?, ?, ?, ?)";
    private static final String SQL_DELETE = "DELETE FROM test.person where id_person = ?";
    private static final String SQL_UPDATE = "UPDATE test.person SET  name=?, lastName=?, mail=?, phone=? WHERE id_person=?";

    public List<Person> select() {
        List<Person> persons = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            Person person = null;
            connection = getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                persons.add(new Person(resultSet.getInt("id_person"), resultSet.getString("name"), resultSet.getString("lastName"), resultSet.getString("mail"), resultSet.getString("phone")));
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
        return persons;
    }

    public int insert(Person person) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int records = 0;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, person.getName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.setString(3, person.getMail());
            preparedStatement.setString(4, person.getPhone());
            records = preparedStatement.executeUpdate();
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

    public int delete(Person person) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int records = 0;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE);
            preparedStatement.setInt(1, (int) person.getIdPerson());
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

    public int update(Person person) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int records = 0;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE);
            preparedStatement.setString(1, person.getName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.setString(3, person.getMail());
            preparedStatement.setString(4, person.getPhone());
            preparedStatement.setInt(5, (int) person.getIdPerson());
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
