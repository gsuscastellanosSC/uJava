package data;

import domain.PersonDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author SC
 */
public interface PersonDao {

    public List<PersonDTO> select() throws SQLException;

    public int insert(PersonDTO person) throws SQLException;

    public int update(PersonDTO person) throws SQLException;

    public int delete(PersonDTO person) throws SQLException;

}
