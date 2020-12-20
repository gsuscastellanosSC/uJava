/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.User;
import data.UserDAO;
import java.util.Scanner;

/**
 *
 * @author UserQV
 */
public class TestUser {

    public static void main(String[] args) {
        UserDAO userDao = new UserDAO();
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
                        userDao.insert(new User("userName " + i, "password " + i));
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el id de la usera a eliminar");
                    out = Integer.parseInt(sc.nextLine());
                    userDao.delete(new User(out));
                    out = 1; //Continue..
                    break;
                case 5:
                    System.out.println("Add id user to update");
                    out = Integer.parseInt(sc.nextLine());
                    System.out.println("Add new userName");
                    String newUserName = sc.nextLine();
                    System.out.println("Add new new Password");
                    String newPassword = sc.nextLine();
                    userDao.update(new User(out, newUserName, newPassword));
                    out = 1; //Continue..
                    break;
                default:
                    System.out.println("Hasta pronto");
            }
        } while (out != 0);
    }
}
