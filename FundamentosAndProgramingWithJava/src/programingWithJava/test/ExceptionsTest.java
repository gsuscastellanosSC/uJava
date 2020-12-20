/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;

import programingWithJava.exeptionsManagement.Arithmetic;
import programingWithJava.exeptionsManagement.ExceptionOperation;
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
        try {
            ans = Arithmetic.div(x, y);
        } catch (ExceptionOperation e) {
            System.out.println("       type Exception: ExceptionOperation \n       " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\n");
            System.out.println("type Exception: Exception \n       " + e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            System.out.println("finally: validate " + x + " / " + y);
        }

        System.out.println(
                "        " + x + " / " + y + " = " + ((ans == 0) ? "+/-oo" : ans));
    }
}
