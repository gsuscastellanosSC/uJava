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
public class ScannerClass {

    public static void main(String args[]) {
        System.out.println("Ingresa tu user: \n");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        System.out.println("User:" + user);

    }
}
