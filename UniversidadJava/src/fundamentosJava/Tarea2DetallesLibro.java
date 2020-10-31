/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author sc
 */
public class Tarea2DetallesLibro {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona el titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = sc.nextLine();
        System.out.println("<"+titulo+">"+" fue escrito por "+"<"+autor+">");
    }
}
