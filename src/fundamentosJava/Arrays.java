/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

import fundamentosJava.inheritance.Person;
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
        addElementsArray(ages);
        printArrays(ages);

        System.out.println("    \nArrays Type Object:   ");
        Person persons[] = new Person[5];
        addElementsArray(persons);
        printArrays(persons);

        System.out.println("    \nInitial Value:    ");
        String numbers[] = {"One", "Two", "Three"};
        printArrays(numbers);
    }

    public static void printArrays(int array[]) {
        System.out.print("          [");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static void printArrays(String array[]) {
        System.out.print("          [");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    public static void printArrays(Object array[]) {
        System.out.print("         [");
        for (int i = 0; i < array.length; i++) {

            if (i < array.length - 1) {
                System.out.print(array[i] + ",\n          ");
            } else {
                System.out.print(array[i]);
            }

        }
        System.out.println("]");
    }

    public static void addElementsArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * (i + 1);
        }
    }

    public static void addElementsArray(Object array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Person("Name" + (i + 1), 'M', 10 * (1 + i), "address" + (i + 1));
        }
    }
}
