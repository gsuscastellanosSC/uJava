package domain;

/**
 *
 * @author SC
 */
public class Person {

    private double idPerson;
    private String name;
    private String lastName;
    private String mail;

    public Person() {
    }

    public Person(double idPerson) {
        this.idPerson = idPerson;
    }

    public Person(String name, String lastName, String mail) {
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
    }

    public Person(double idPerson, String name, String lastName, String mail) {
        this.idPerson = idPerson;
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
    }

    public double getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(double idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{idPerson=").append(idPerson);
        sb.append(", name=").append(name);
        sb.append(", lastName=").append(lastName);
        sb.append(", mail=").append(mail);
        sb.append('}');
        return sb.toString();
    }
}
