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
public class Tarea5ElmayorDeDosNumeros {
    public static void main (String args[]){
        int numberOne;
        int numberTwo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona el numero 1;");
        numberOne = Integer.parseInt(sc.nextLine());
        System.out.println("Proporciona el numero2:");
        numberTwo = Integer.parseInt(sc.nextLine());
        System.out.print("El numero mayor es:");
        System.out.println((numberOne>numberTwo)?numberOne:numberTwo);
    }
}
