/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
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

        Set mySet = new HashSet();
        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        mySet.add("Friday");
        mySet.add("Saturday");
        mySet.add("Sunday");
//        showData(mySet);

        Map myMap = new HashMap();
        myMap.put("keyDayOne", "Monday");
        myMap.put("keyDayTwo", "Tuesday");
        myMap.put("keyDayThirteen", "Wednesday");
        myMap.put("keyDayFour", "Thursday");
        myMap.put("keyDayFive", "Friday");
        myMap.put("keyDaySix", "Saturday");
        myMap.put("keyDaySeven", "Sunday");

        showData(myMap.keySet());
        showData(myMap.values());

    }

    public static void showData(Collection collection) {
        //     for (Object element : collection) {
//            System.out.println("element = " + element);
//        }
        collection.forEach(element -> {
            System.out.println("element = " + element);
        });
    }
}
