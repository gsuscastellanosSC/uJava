/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.UserDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author UserQV
 */
public interface UserDao {

    public List<UserDTO> select() throws SQLException;

    public int insert(UserDTO user) throws SQLException;

    public int update(UserDTO user) throws SQLException;

    public int delete(UserDTO user) throws SQLException;
}
