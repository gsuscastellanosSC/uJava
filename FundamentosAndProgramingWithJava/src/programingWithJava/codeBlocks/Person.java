/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.codeBlocks;

/**
 *
 * @author sc
 */
public class Person {

    private final int IDPERSON;
    private static int accPerson;

    static { //Start Only Static vars
        System.out.println("Execution Static Block");
        ++Person.accPerson;
    }

    {
        System.out.println("Execution no Static Block");
        this.IDPERSON = Person.accPerson++;
    }

    public Person() {
        System.out.println("Execute Builder");
    }

    public int getIDPERSON() {
        return IDPERSON;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{IDPERSON=").append(IDPERSON);
        sb.append('}');
        return sb.toString();
    }

}
