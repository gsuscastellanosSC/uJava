/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;

import programingWithJava.managementForEach.forEach;
import fundamentosJava.inheritance.Person;

/**
 *
 * @author sc
 */
public class ForEachTest {

    public static void main(String[] args) {
        Object ages[] = {5, 6, 8, 9};
        forEach.execute(ages);
        Person p1[] = {new Person("Jesús"), new Person(), new Person(), new Person(), new Person()};
        forEach.execute(p1);
    }
}
