/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava.Inheritance;

import java.util.Date;

/**
 *
 * @author sc
 */
public class TestInheritance {

    public static void main(String[] args) {

        System.out.println("\nPerson:   ");
        Person personOne = new Person("Sc");
        System.out.println("        " + personOne);

        System.out.println("\nEmployee:   ");
        Employee employeeOne = new Employee(2000, "Jhon", 'M', 30, "Calle");
        employeeOne.name = "Jesus";
        System.out.println("        " + employeeOne);
        
        System.out.println("\nClient:   ");
        Date date = new Date();
        Client clientOne = new Client(date, true, "name", '0', 24, "address");
        System.out.println("        "+clientOne);
    }
}
