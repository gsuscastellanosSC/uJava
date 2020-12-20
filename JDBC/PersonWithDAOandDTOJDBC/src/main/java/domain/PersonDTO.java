package domain;

/**
 *
 * @author SC
 */
public class PersonDTO {

    private double idPerson;
    private String name;
    private String lastName;
    private String mail;
    private String phone;

    public PersonDTO() {
    }

    public PersonDTO(double idPerson) {
        this.idPerson = idPerson;
    }

    public PersonDTO(String name, String lastName, String mail, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.phone = phone;
    }

    public PersonDTO(double idPerson, String name, String lastName, String mail, String phone) {
        this.idPerson = idPerson;
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPerson{idPerson=").append(idPerson);
        sb.append(", name=").append(name);
        sb.append(", lastName=").append(lastName);
        sb.append(", mail=").append(mail);
        sb.append(", phone=").append(phone);
        sb.append('}');
        return sb.toString();
    }
}
