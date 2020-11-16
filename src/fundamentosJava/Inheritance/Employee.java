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
public class Employee extends Person {

    private int idEmployee;
    private double salary;
    private static int accEmployee;

    public Employee(double salary, String name, char gender, int age, String address) {
        super(name, gender, age, address);
        this.idEmployee = ++Employee.accEmployee;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "idEmployee=" + idEmployee + ", salary=" + salary + '}' + super.toString();
    }

}
