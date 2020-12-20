/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava.inheritance;

import java.util.Date;

/**
 *
 * @author sc
 */
public class Client extends Person {

    public static int getAccClient() {
        return accClient;
    }

    public static void setAccClient(int aAccClient) {
        accClient = aAccClient;
    }

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

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Date getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(Date RegistrationDate) {
        this.RegistrationDate = RegistrationDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
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
