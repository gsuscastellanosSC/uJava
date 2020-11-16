/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava.Inheritance;

import java.util.Date;

/**
 *
 * @author sc
 */
public class Client extends Person {

    private int idClient;
    private Date RegistrationDate;
    private boolean vip;
    private static int accClient;

    public Client(Date RegistrationDate, boolean vip, String name, char gender, int age, String address) {
        super(name, gender, age, address);
        this.idClient = ++Client.accClient;
        this.RegistrationDate = RegistrationDate;
        this.vip = vip;
        this.accClient = accClient;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{idClient=").append(idClient);
        sb.append(", RegistrationDate=").append(RegistrationDate);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
