/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava.inheritance;

/**
 *
 * @author sc
 */
public class Person {

    protected int idPerson;
    protected String name;
    protected char gender;
    protected int age;
    protected String address;
    protected static int addPerson;

    public Person() {
        this.idPerson = ++Person.addPerson;
    }

    public Person(String name) {
        this.idPerson = ++Person.addPerson;
        this.name = name;
    }

    public Person(String name, char gender, int age, String address) {
        this.idPerson = ++Person.addPerson;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getAddPerson() {
        return addPerson;
    }

    public static void setAddPerson(int addPerson) {
        Person.addPerson = addPerson;
    }

    @Override
    public String toString() {
        return "Person{" + "idPerson=" + idPerson + ", name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + '}';
    }

}
