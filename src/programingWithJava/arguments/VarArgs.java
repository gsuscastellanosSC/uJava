/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.arguments;

/**
 *
 * @author sc
 */
public class VarArgs {

    public static void showNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("element: " + numbers[i]);
        }
    }

    public static void some(String name, int... numbers) {
        System.out.println("name = " + name);
        VarArgs.showNumbers(numbers);
    }
}
