/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;

import programingWithJava.exeptionsManagement.Arithmetic;
import programingWithJava.exeptionsManagement.Exeption;

/**
 *
 * @author sc
 */
public class ExceptionsTest {

    public static void main(String[] args) {

        Exeption.div(1000, 0);

        System.out.println("\n");
        int ans = 0;
        int x = 0;
        int y = 0;
        ans = Arithmetic.div(x, y);
        System.out.println("        " + x + " / " + y + " = " + ((ans == 0) ? "+/-oo" : ans));
    }
}
