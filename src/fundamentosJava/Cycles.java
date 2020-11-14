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
            System.out.println("        ac: " + ac);
            ac++;
        }
        
        System.out.println("    Do While: ");
        do {            
            System.out.println("        ac: " + ac);
            ac++;
        } while (ac<3);
    }
}
