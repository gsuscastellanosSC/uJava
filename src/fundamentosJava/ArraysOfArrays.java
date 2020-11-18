/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

import fundamentosJava.inheritance.Person;

/**
 *
 * @author sc
 */
public class ArraysOfArrays {
    
    public static void main(String[] args) {
        int rows = 3;
        int columns = 2;
        String arrayOfArrays[][] = new String[3][2];
        arrayOfArrays[0][0] = "0-0";
        arrayOfArrays[0][1] = "0-1";
        arrayOfArrays[1][0] = "1-0";
        arrayOfArrays[1][1] = "1-1";
        arrayOfArrays[2][0] = "2-0";
        arrayOfArrays[2][1] = "2-1";
        System.out.println("Array Of Arrays");
        printArrayOfArrays2d(arrayOfArrays);
        
        System.out.println("Array Of Arrays Short");
        String arraysOfArraysShort[][] = {{"0", "1"}, {"1", "0"}, {"1", "1"}};
        printArrayOfArrays2d(arraysOfArraysShort);
        
        System.out.println("\nArray Of Arrays Objects");
        Person persons[][] = new Person[rows][columns];
        
        persons[0][0] = new Person("Jesus");
        persons[0][1] = new Person("Jhon");
        printArrayOfArrays2d(persons);
    }
    
    public static void printArrayOfArrays2d(Object arrayOfArrays2d[][]) {
        System.out.print("[");
        for (int row = 0; row < arrayOfArrays2d.length; row++) {
            System.out.print("[");
            for (int column = 0; column < arrayOfArrays2d[row].length; column++) {
                if (column < arrayOfArrays2d[column].length - 1) {
                    System.out.print(arrayOfArrays2d[row][column] + ", ");
                } else {
                    if (row < arrayOfArrays2d.length - 1) {
                        System.out.println(arrayOfArrays2d[row][column] + "], ");
                    } else {
                        System.out.print(arrayOfArrays2d[row][column] + "]");
                    }
                }
            }
        }
        System.out.println("]");
    }
}
