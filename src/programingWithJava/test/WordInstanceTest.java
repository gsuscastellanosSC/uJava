/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;

import programingWithJava.wordInstance.Employee;
import programingWithJava.wordInstance.Manager;

/**
 *
 * @author sc
 */
public class WordInstanceTest {

    public static void main(String[] args) {
        System.out.println("Use of word Instanceof: ");
        Employee employees[] = {new Employee("Jesús", "Ing", 20.000), new Manager(200.00, "Sc", "CEO", 100.000)};
        for (Employee employee : employees) {
            System.out.println(employee.showData() + ", (employee instanceof Manager): " + (employee instanceof Manager));
        }
    }
}
