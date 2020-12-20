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
public class ScopeOfVariables {

    public static void main(String args[]) {
        int a = 1;
        int b = 2;

        System.out.println("\nScope:  ");
        System.out.println("        Scope main: ");
        System.out.println("            a =" + a + ", b = " + b);
        System.out.println("        Scope Class Arithmetic: ");
        Arithmetic arithmeticTwo = new Arithmetic(20, 100);
        
    }

    public static class Arithmetic {

        int a;
        int b;

        public Arithmetic() {
        }

        public Arithmetic(int a, int b) {
            System.out.println("            a =" + a + ", b = " + b);
            this.a = a;
            this.b = b;
        }

        public void sum() {
            System.out.println("        " + a + " + " + b + " = " + (a + b));
        }

        public int sumWithReturn() {
            return a + b;
        }

        public int sumWithArguments(int a, int b) {
            return a + b;
        }

        /**
         *
         * @param a
         * @param b
         * @return
         */
        public int sumWithThis(int a, int b) {
            this.a = a;
            this.b = b;
            return this.sumWithReturn();
        }

    }
}
