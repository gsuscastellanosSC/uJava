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

    public static void execute(Object elements[]) {
        for (Object element : elements) {
            System.out.println("element = " + element + ", the type " + element.getClass());
        }
    }

}
