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
public class Builders {

    public static void main(String args[]) {
        Arithmetic suma = new Arithmetic(1, 2);
        suma.sum();
    }

    public static class Arithmetic {

        int a;
        int b;

        public Arithmetic(int a, int b) {
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
