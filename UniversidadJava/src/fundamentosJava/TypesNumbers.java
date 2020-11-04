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
public class TypesNumbers {

    public static void main(String[] args) {
        System.out.println("Byte: ");
        byte numByte = (byte) 129;
        System.out.println("number Byte:" + numByte);
        System.out.println("Valor minimo Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo Byte: " + Byte.MAX_VALUE);

        System.out.println("Short: ");
        short numShort = (short) 32769;
        System.out.println("number Short:" + numShort);
        System.out.println("Valor minimo Short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo Short: " + Short.MAX_VALUE);

        System.out.println("Int: ");
        int numInt = (int) 2147483647L;
        System.out.println("number Int:" + numInt);
        System.out.println("Valor minimo Int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo Int: " + Integer.MAX_VALUE);

        System.out.println("Long: ");
        long numLong = 9223372036854775807L;
        System.out.println("number Long:" + numLong);
        System.out.println("Valor minimo Long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo Long: " + Long.MAX_VALUE);

        System.out.println("Float: ");
        float numFloat = (float) 3.4028235E38D;
        System.out.println("number Float:" + numFloat);
        System.out.println("Valor minimo Float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo Float: " + Float.MAX_VALUE);
        
        System.out.println("Double: ");
        double numDouble = 1.7976931348623157E308;
        System.out.println("number Double:" + numDouble);
        System.out.println("Valor minimo Double:" + Double.MIN_VALUE);
        System.out.println("Valor maximo Double: " + Double.MAX_VALUE);
    }
}
