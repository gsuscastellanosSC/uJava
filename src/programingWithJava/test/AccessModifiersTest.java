/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;

import programingWithJava.accessModifiers.packageOne.ClassOne;

/**
 *
 * @author sc
 */
public class AccessModifiersTest {

    public static void main(String[] args) {
        ClassOne class1 = new ClassOne();
        System.out.println("Class1 = " + class1.PublicAttribute);
        class1.methodPublic();
    }
}
