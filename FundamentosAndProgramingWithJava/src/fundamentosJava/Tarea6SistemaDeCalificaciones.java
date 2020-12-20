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
public class Tarea6SistemaDeCalificaciones {

    public static void main(String args[]) {
        int note = 0;
        String noteText = "Valor desconocido";
        Scanner sc = new Scanner(System.in);
        System.out.print("Proporciona un valor entre 0 y 10: ");
        note = Integer.parseInt(sc.nextLine());
        if (note >= 9 && note <= 10) {
            noteText = "A";
        } else if (note >= 8 && note < 9 ) {
            noteText = "B";
        } else if (note >= 7 && note < 8) {
            noteText = "C";
        } else if (note >= 6 && note < 7) {
            noteText = "D";
        } else if (note >= 0 && note < 6) {
            noteText = "F";
        }
        System.out.println(noteText);
    }
}
