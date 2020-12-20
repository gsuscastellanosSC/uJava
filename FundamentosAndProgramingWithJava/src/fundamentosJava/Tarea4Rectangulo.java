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
public class Tarea4Rectangulo {

    public static void main(String args[]) {
        int height;
        int width;
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporcionar el alto: ");
        height = Integer.parseInt(sc.nextLine());
        System.out.println("Proporcione el ancho");
        width = Integer.parseInt(sc.nextLine());
        System.out.println("Area: " + width * height);
        System.out.println("Perimetro: " + (height + width) * 2);

    }
}
