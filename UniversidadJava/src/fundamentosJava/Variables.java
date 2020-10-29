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
public class Variables {
    public static void main (String args[]){
        int myInt = 10;
        System.out.println(myInt);
        myInt = 5;
        System.out.println(myInt);
        
        String myString="saludos";
        System.out.println(myString);
        myString="adios";
        System.out.println(myString);
        
        var myIntNewInJava = 10;
        System.out.println(myIntNewInJava);
        var myStringNewInJava = "Desde java 10 var infiere el tipo de dato.";
        System.out.println(myString+myStringNewInJava);
        
    }
    
}
