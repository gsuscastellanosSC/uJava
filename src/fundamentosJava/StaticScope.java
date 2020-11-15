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
public class StaticScope {

    public static void main(String[] args) {
        StaticScope personOne = new StaticScope("Sc");
        System.out.println(personOne);
    }

    private int idPerson;
    private String name;
    private static int acPerson;

    public StaticScope(String name) {
        this.name = name;
        StaticScope.acPerson++;
        this.idPerson = StaticScope.acPerson;
    }

    public static int getAcPerson() {
        return acPerson;
    }

    public static void setAcPerson(int aAcPerson) {
        acPerson = aAcPerson;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    @Override
    public String toString() {
        return "StaticScope{" + "idPerson=" + idPerson + ", name=" + name + '}';
    }

}
