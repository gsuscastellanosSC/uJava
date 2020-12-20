package test;

import data.ConnectionClass;
import data.PersonDao;
import data.PersonDaoJDBC;
import domain.PersonDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author sc
 */
public class TestPersonDAOAndDTO {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = ConnectionClass.getConnection();
            if (connection.getAutoCommit()) {
                connection.setAutoCommit(false);
            }
            PersonDao personDao = new PersonDaoJDBC(connection);
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
                        System.out.println(personDao.select().toString());
                        break;
                    case 3:
                        for (int i = 10001; i <= 10010; i++) {
                            System.out.println("Name " + i + "lastName " + i + "mail " + i + "phone " + i);
                            personDao.insert(new PersonDTO("Name " + i, "lastName " + i, "mail " + i, "phone " + i));
                        }
                        break;
                    case 4:
                        System.out.println("Ingrese el id de la persona a eliminar");
                        out = Integer.parseInt(sc.nextLine());
                        personDao.delete(new PersonDTO(out));
                        out = 1; //Continue..
                        break;
                    case 5:
                        System.out.println("Add id person to update");
                        out = Integer.parseInt(sc.nextLine());
                        System.out.println("Add new name");
                        String newName = sc.nextLine();
                        System.out.println("Add new new last name");
                        String newLastName = sc.nextLine();
                        System.out.println("Add new new mail");
                        String newMail = sc.nextLine();
                        System.out.println("Add new new phone");
                        String newPhone = sc.nextLine();
                        personDao.update(new PersonDTO(out, newName, newLastName, newMail, newPhone));
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
