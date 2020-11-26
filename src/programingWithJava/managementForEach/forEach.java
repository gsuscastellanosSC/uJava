/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.managementForEach;

/**
 *
 * @author sc
 */
public class forEach {

    private static int ages[] = {5, 6, 8, 9};

    public static void execute() {
        for (int age : forEach.ages) {
            System.out.println("age = " + age);
        }
    }

}
