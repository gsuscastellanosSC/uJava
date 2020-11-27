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
public class ImplementationOracle implements DataAccess {

    @Override
    public void insert() {
        System.out.println("    Insert from Oracle");
    }

    @Override
    public void list() {
        System.out.println("     List from Oracle");
    }

    @Override
    public void update() {
        System.out.println("     Update from Oracle");
    }

    @Override
    public void delete() {
        System.out.println("     Delete from Oracle");
    }

}
