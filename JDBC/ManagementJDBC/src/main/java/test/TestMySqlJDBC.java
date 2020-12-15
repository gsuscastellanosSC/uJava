package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sc
 */
public class TestMySqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, "sc", "GsusC292020*");
            Statement instruction = connection.createStatement();
            String sql = "select id_person, name, lastName, mail, phone from person";
            ResultSet result = instruction.executeQuery(sql);
            while (result.next()) {
                System.out.println("\nId Person: " + result.getInt("id_person")
                        + ", Nombre: " + result.getString("name")
                        + ", Apellido: " + result.getString("lastName")
                        + ", Correo:" + result.getString("mail")
                        + " Telefono:" + result.getString("phone"));
            }
            result.close();
            instruction.close();
            connection.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
