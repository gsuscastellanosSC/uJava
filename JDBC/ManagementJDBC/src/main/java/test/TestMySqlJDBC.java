package test;

import data.PersonDAO;

/**
 *
 * @author sc
 */
public class TestMySqlJDBC {
    public static void main(String[] args) {
        PersonDAO personDao = new PersonDAO();
        System.out.println(personDao.select().toString());
    }
}
