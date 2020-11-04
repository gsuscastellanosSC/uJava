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
public class TypesVar {

    public static void main(String[] args) {
        byte numByte = (byte) 129;
        System.out.println("number Byte:" + numByte);
        System.out.println("Valor minimo Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo Byte: " + Byte.MAX_VALUE);

        System.out.println("");
        short numShort = (short) 32769;
        System.out.println("number Short:" + numShort);
        System.out.println("Valor minimo Short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo Short: " + Short.MAX_VALUE);
        
        System.out.println("");
        int numInt = (int)2147483647L;
        System.out.println("number Int:" + numInt);
        System.out.println("Valor minimo Int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo Int: " + Integer.MAX_VALUE);
        
        System.out.println("");
        long numLong = 9223372036854775807L;
        System.out.println("number Long:" + numLong);
        System.out.println("Valor minimo Long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo Long: " + Long.MAX_VALUE);
    }
}
