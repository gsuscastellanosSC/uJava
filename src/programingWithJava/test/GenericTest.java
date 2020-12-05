package programingWithJava.test;

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
    }
}
