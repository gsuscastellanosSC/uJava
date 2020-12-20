/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;

import programingWithJava.accessModifiers.packageOne.ClassPublic;
import programingWithJava.accessModifiers.packageOne.ClassProtected;

/**
 *
 * @author sc
 */
public class AccessModifiersTest {

    public static void main(String[] args) {
        System.out.println("Public: ");
        ClassPublic class1 = new ClassPublic();
        System.out.println("        Class1 = " + class1.PublicAttribute);
        class1.methodPublic();
        System.out.println("Protected: ");
        ClassProtected class2 = new ClassProtected("Public");
    }
}
