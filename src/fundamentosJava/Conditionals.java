/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

import java.util.Scanner;

/**
 *
 * @author sc
 */
public class Conditionals {

    public static void main(String args[]) {

        System.out.println("\nIf Else: ");
        boolean conditional = true;
        if (conditional) {
            System.out.println("        Is True");
        } else {
            System.out.println("        Is False");
        }

        int number = 2;
        String numberText = "#N/A";
        if (number == 2) {
            System.out.println("        Number two");
        } else {
            System.out.println("        " + numberText);
        }

        System.out.println("\nCálculo estación del año con if-else: ");
        String season = "Unknown station";
        Scanner sc = new Scanner(System.in);
        System.out.print("        Enter a month ");
        int month = Integer.parseInt(sc.nextLine());
        if (month == 1 || month == 2 || month == 3) {
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Summer";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Autumn";
        }
        System.out.println("        The season for month " + month + " is " + season);
    }
}
