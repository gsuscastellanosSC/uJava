/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;

import programingWithJava.collections.Collections;

/**
 *
 * @author sc
 */
public class CollectionsTest {

    public static void main(String[] args) {
        Collections.myList.add("Monday");
        Collections.myList.add("Tuesday");
        Collections.myList.add("Wednesday");
        Collections.myList.add("Thursday");
        Collections.myList.add("Friday");
        Collections.myList.add("Saturday");
        Collections.myList.add("Sunday");
        
//     for (Object element : Collections.myList) {
//            System.out.println("element = " + element);
//        }
        Collections.myList.forEach(element -> {
            System.out.println("element = " + element);
        });
    }
}
