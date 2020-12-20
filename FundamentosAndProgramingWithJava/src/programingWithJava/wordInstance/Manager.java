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
public class Manager extends Employee {

    private Double bond;

    public Manager() {

    }

    public Manager(Double bond, String name, String position, Double salary) {
        super(name, position, salary);
        this.bond = bond;
    }

    @Override
    public String showData() {
        StringBuilder sb = new StringBuilder();
        sb.append("").append(super.showData());
        sb.append(", bond=").append(this.bond);
        return sb.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
