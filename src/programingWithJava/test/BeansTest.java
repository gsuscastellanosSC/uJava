/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;

import programingWithJava.beans.Person;

/**
 *
 * @author sc
 */
public class BeansTest {

    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.setName("Jesus");
        personOne.setLastaName("Castellanos");
        System.out.println(personOne);
        System.out.println(personOne.getName() + " " + personOne.getLastaName());
    }

}
