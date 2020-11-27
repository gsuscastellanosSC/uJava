/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.wordInstance;

/**
 *
 * @author sc
 */
public class Employee {

    private String name;
    private String position;
    private Double salary;

    public Employee() {

    }

    public Employee(String name, String position, Double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String showData() {
        StringBuilder sb = new StringBuilder();
        sb.append("         Employee{name=").append(name);
        sb.append(", position=").append(position);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

}
