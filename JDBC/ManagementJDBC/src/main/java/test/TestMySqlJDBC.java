package test;

import data.PersonDAO;
import domain.Person;

/**
 *
 * @author sc
 */
public class TestMySqlJDBC {

    public static void main(String[] args) {
        PersonDAO personDao = new PersonDAO();
        System.out.println("Insert Data...");
        for (int i = 10001; i <= 10010; i++) {
            System.out.println("Name " + i + "lastName " + i + "mail " + i + "phone " + i);
            personDao.insert(new Person("Name " + i, "lastName " + i, "mail " + i, "phone " + i));
        }
        System.out.println(personDao.select().toString());

    }
}
