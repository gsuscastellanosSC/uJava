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
public class Tarea3TiendaLibros {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        String name = sc.nextLine();
        System.out.println("Proporciona el id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Proporciona el precio: ");
        double cost = Double.parseDouble(sc.nextLine());
        System.out.println("Proporciona el envio gratuito: ");
        boolean SendFree = Boolean.parseBoolean(sc.next());
    }
}
