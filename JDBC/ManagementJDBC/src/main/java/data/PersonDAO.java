package data;

import domain.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SC
 */
public class PersonDAO {

    private static final String SQL_SELECT = "select id_person, name, lastName, mail, phone from person";

    public List<Person> select() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Person person = null;
        List<Person> persons = new ArrayList<>();
        return persons;
    }
}
