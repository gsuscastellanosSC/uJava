/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

import fundamentosJava.Inheritance.Person;
import java.util.Iterator;

/**
 *
 * @author sc
 */
public class Arrays {

    public static void main(String[] args) {
        System.out.println("\nArrays:    ");
        int ages[] = new int[3];
        System.out.println("    Array of Type Primitive:    ");
        System.out.print("          [");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = (1 + i) + 10 * i;
            if (i < ages.length - 1) {
                System.out.print(ages[i] + ", ");
            } else {
                System.out.print(ages[i]);
            }

        }
        System.out.println("]");

        System.out.println("    \nArrays Type Object:   ");
        Person persons[] = new Person[5];
        System.out.print("         [");
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person("Name" + (i + 1), 'M', 10 * (1 + i), "address" + (i + 1));
            if (i < persons.length - 1) {
                System.out.print(persons[i] + ",\n          ");
            } else {
                System.out.print(persons[i]);
            }

        }
        System.out.println("]");
    }
}
