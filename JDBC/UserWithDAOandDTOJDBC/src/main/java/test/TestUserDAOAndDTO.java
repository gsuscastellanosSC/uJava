/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import data.ConnectionClass;
import data.UserDao;
import domain.UserDTO;
import data.UserDaoJDBC;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author SC
 */
public class TestUserDAOAndDTO {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = ConnectionClass.getConnection();
            if (connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }
            UserDao userDao = new UserDaoJDBC(connection);
            int out = 1;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("(0) Exit");
                System.out.println("(1) Continue");
                System.out.println("2. Select");
                System.out.println("3. Insert");
                System.out.println("4. Delete");
                System.out.println("5. Update");
                out = Integer.parseInt(sc.nextLine());
                switch (out) {
                    case 2:
                        System.out.println(userDao.select().toString());
                        break;
                    case 3:
                        for (int i = 10001; i <= 10010; i++) {
                            System.out.println("userName " + i + "password " + i);
                            userDao.insert(new UserDTO("userNameuserNameuserNameuserNameuserNameuserNameuserNameuserNameuserNameuserNameuserNameuserNameuserNameuserNameuserNameuserName " + i, "password " + i));
                        }
                        break;
                    case 4:
                        System.out.println("Ingrese el id de la usera a eliminar");
                        out = Integer.parseInt(sc.nextLine());
                        userDao.delete(new UserDTO(out));
                        out = 1; //Continue..
                        break;
                    case 5:
                        System.out.println("Add id user to update");
                        out = Integer.parseInt(sc.nextLine());
                        System.out.println("Add new userName");
                        String newUserName = sc.nextLine();
                        System.out.println("Add new new Password");
                        String newPassword = sc.nextLine();
                        userDao.update(new UserDTO(out, newUserName, newPassword));
                        out = 1; //Continue..
                        break;
                    default:
                        System.out.println("Hasta pronto");
                }
            } while (out != 0);
            System.out.println("haciendo commit...");
            connection.commit();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            try {
                System.out.println("haciendo rollback...");
                connection.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
