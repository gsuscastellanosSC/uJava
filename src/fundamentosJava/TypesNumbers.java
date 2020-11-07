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
        System.out.println("\nByte: ");
        byte numByte = (byte) 129;
        System.out.println("number Byte:" + numByte);
        System.out.println("Valor minimo Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo Byte: " + Byte.MAX_VALUE);

        System.out.println("\nShort: ");
        short numShort = (short) 32769;
        System.out.println("number Short:" + numShort);
        System.out.println("Valor minimo Short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo Short: " + Short.MAX_VALUE);

        System.out.println("\nInt: ");
        int numInt = (int) 2147483647L;
        System.out.println("number Int:" + numInt);
        System.out.println("Valor minimo Int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo Int: " + Integer.MAX_VALUE);

        System.out.println("\nLong: ");
        long numLong = 9223372036854775807L;
        System.out.println("number Long:" + numLong);
        System.out.println("Valor minimo Long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo Long: " + Long.MAX_VALUE);

        System.out.println("\nFloat: ");
        float numFloat = (float) 3.4028235E38D;
        System.out.println("number Float:" + numFloat);
        System.out.println("Valor minimo Float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo Float: " + Float.MAX_VALUE);

        System.out.println("\nDouble: ");
        double numDouble = 1.7976931348623157E308;
        System.out.println("number Double:" + numDouble);
        System.out.println("Valor minimo Double:" + Double.MIN_VALUE);
        System.out.println("Valor maximo Double: " + Double.MAX_VALUE);

        System.out.println("\nvar with int: ");
        var intNumber = 10;
        System.out.println("Int Number= " + intNumber);

        System.out.println("\nvar with Double: ");
        var doubleNumber = 10.0;
        System.out.println("Double Number= " + doubleNumber);

        System.out.println("\nvar with Float: ");
        var floatNumber = 10.0F;
        System.out.println("Float Number= " + floatNumber);
    }
}
