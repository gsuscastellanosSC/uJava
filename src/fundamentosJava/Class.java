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
public class Class {

    public static void main(String args[]) {

        System.out.println("\nPerson One:   ");
        Person personOne = new Person();
        personOne.name = "Juan";
        personOne.lastName = "Perez";
        personOne.gender = "Male";
        personOne.occupation = "Engineer";
        personOne.dataPerson();

        System.out.println("\nPerson Two:   ");
        Person personTwo = new Person();
        personTwo.name = "Jesus";
        personTwo.lastName = "Castellanos";
        personTwo.gender = "Male";
        personTwo.occupation = "Engineer";
        personTwo.dataPerson();

        System.out.println("\nMethods:  ");
        Arithmetic sum = new Arithmetic();
        sum.a = 3;
        sum.b = 2;
        sum.sum();
        System.out.println("       sumWithReturn(): " + sum.a + " + " + sum.b + " = " + sum.sumWithReturn());
        System.out.println("       sumWithArguments: " + sum.a + " + " + sum.b + " = " + sum.sumWithArguments(sum.a, sum.b));

    }

    public static class Arithmetic {

        int a;
        int b;

        public void sum() {
            System.out.println("       void sum(): " + a + " + " + b + " = " + (a + b));
        }

        public int sumWithReturn() {
            return a + b;
        }

        public int sumWithArguments(int a, int b) {
            return a + b;
        }

        public static class Person {

            String name;
            String lastName;
            String gender;
            String occupation;

            public void dataPerson() {
                System.out.println("        Name: " + name);
                System.out.println("        Last name: " + lastName);
                System.out.println("        Gender: " + gender);
                System.out.println("        Occupation: " + occupation);
            }

        }

    }
}
