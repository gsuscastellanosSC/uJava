/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;
import programingWithJava.autoBoxingAndUnBoxing.AutoBoxingAndUnBoxing;
/**
 *
 * @author sc
 */
public class AutoBoxingAndUnBoxingTest {

    public static void main(String[] args) {
        Integer integer = 10;
        System.out.println("Integer = "+integer.toString());
        System.out.println("Integer = "+integer.byteValue());
        System.out.println("Integer = "+integer.floatValue());
        System.out.println("Integer = "+integer.hashCode());
        System.out.println("Integer = "+integer.longValue());
        
        int integer1 = integer;
        System.out.println("Integer1 = "+integer1);
    }
}
