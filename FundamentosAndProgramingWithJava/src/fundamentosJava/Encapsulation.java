/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

/**
 *
 * @author sc
 */
public class Encapsulation {

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation("Juan", 50000.00, false);
        System.out.println(person.toString());
        System.out.println(person);
    }

    private String name;
    private double salary;
    private boolean deleted;

    public Encapsulation(String name, double salary, boolean deleted) {
        this.name = name;
        this.salary = salary;
        this.deleted = deleted;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", salary=" + salary + ", deleted=" + deleted + '}';
    }

}
