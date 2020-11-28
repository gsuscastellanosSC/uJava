/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.exeptionsManagement;

/**
 *
 * @author sc
 */
public class Exeption {

    public static void div(int x) {
        int ans = 0;
        try {
            ans = x / 0;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        System.out.println("    x/0 = " + ((ans==0)?"Indefindo":ans));
    }
}
