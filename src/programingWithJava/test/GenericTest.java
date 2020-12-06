package programingWithJava.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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

        List<String> myList = new ArrayList<String>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");

//        String element = myList.get(0);
//        System.out.println(element);
        showData(myList);
    }

    public static void showData(Collection<String> colection) {
        colection.forEach(element -> {
            System.out.println("Element = " + element);
        });

    }
}
