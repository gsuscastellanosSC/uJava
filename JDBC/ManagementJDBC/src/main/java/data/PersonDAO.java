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

    private static final String SQL_SELECT = "select id_person, name, lastName, mail, phone from person";

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
        }finally{
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
}
