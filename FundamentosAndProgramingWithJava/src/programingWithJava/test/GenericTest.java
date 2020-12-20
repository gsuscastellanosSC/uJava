package programingWithJava.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import programingWithJava.genericsClass.GenericClass;

/**
 *
 * @author sc
 */
public class GenericTest {

    public static void main(String[] args) {
        GenericClass<Integer> objectInt = new GenericClass(15);
        objectInt.getType();

        GenericClass<Integer> objectString = new GenericClass("Sc");
        objectString.getType();

        System.out.println("\nList:    ");
        List<String> myList = new ArrayList<String>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");
        showData(myList);

        System.out.println("\nSet:    ");
        Set<String> mySet = new HashSet<String>();
        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        mySet.add("Friday");
        mySet.add("Saturday");
        mySet.add("Sunday");
        showData(mySet);
//        String element = myList.get(0);
//        System.out.println(element);
        showData(myList);

        System.out.println("\nMap:    ");
        Map<String, String> myMap = new HashMap<String, String>();
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

    public static void showData(Collection<String> colection) {
        colection.forEach(element -> {
            System.out.println("    Element = " + element);
        });

    }

}
