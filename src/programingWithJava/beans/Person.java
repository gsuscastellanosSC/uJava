/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.beans;

import java.io.Serializable;

/**
 *
 * @author sc
 */
public class Person implements Serializable {

    private String name;
    private String lastaName;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastaName() {
        return lastaName;
    }

    public void setLastaName(String lastaName) {
        this.lastaName = lastaName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{name=").append(name);
        sb.append(", lastaName=").append(lastaName);
        sb.append('}');
        return sb.toString();
    }

}
