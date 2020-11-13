/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

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
        if(number ==2){
            System.out.println("        Number two");
        }else{
            System.out.println("        "+numberText);
        }
    }
}
