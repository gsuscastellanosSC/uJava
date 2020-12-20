/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

/**
 *
 * @author sc
 */
public class ConcatenateStrings {

    public static void main(String args[]) {
        String user = "Juan";
        String title = "Engineer";
        int age = 25;
        int height = 166;
        System.out.println(user + " " + title);
        //Contexto Cadena
        System.out.println(user + title + age + height);
        System.out.println(user + title + (age + height));
        System.out.println(age + height + user + title);
        System.out.println(age + height + user + title);

    }

}
