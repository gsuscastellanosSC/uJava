/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

import java.util.Iterator;

/**
 *
 * @author sc
 */
public class Arrays {

    public static void main(String[] args) {
        int ages[] = new int[3];
        System.out.print("[");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = (1 + i) + 10 * i;
            if (i < ages.length - 1) {
                System.out.print(ages[i] + ", ");
            } else {
                System.out.print(ages[i]);
            }

        }
        System.out.println("]");
    }
}
