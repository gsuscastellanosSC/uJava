/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava.Inheritance;

/**
 *
 * @author sc
 */
public class TestInheritance {
    public static void main(String[] args) {
        Person personOne = new Person("Sc");
        System.out.println(personOne);
        
        Employee employeeOne = new Employee();
        employeeOne.name="Jesus";
        System.out.println(employeeOne);
    }
}
