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
public class Cycles {

    public static void main(String args[]) {
        System.out.println("\nCycles: ");

        System.out.println("    While: ");
        int ac = 0;
        while (ac < 3) {
            System.out.println("        ac = " + ac);
            ac++;
        }

        System.out.println("    Do While: ");
        do {
            System.out.println("        ac = " + ac);
            ac++;
        } while (ac < 3);

        System.out.println("    For: ");
        for (double i = 0.0; i < 3.0; i++) {
            System.out.println("        ac = " + i);
        }
        System.out.println("    Break y Continue: ");
        System.out.println("        Break: ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("            ac = " + i + " es el primer número par.");
                break;
            }
        }
        System.out.println("        Continue: ");
          for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
               continue; //Ir a la siguiente iteración;
            }
            System.out.println("            ac = " + i + ", número par.");
        }
    }
}
