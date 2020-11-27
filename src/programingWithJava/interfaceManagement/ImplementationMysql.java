/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.interfaceManagement;

/**
 *
 * @author sc
 */
public class ImplementationMysql implements DataAccess {

    @Override
    public void insert() {
        System.out.println("    Insert from MySql");
    }

    @Override
    public void list() {
        System.out.println("     List from MySql");
    }

    @Override
    public void update() {
        System.out.println("     Update from MySql");
    }

    @Override
    public void delete() {
        System.out.println("     Delete from MySql");
    }

}
