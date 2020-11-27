/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;

import programingWithJava.interfaceManagement.DataAccess;
import programingWithJava.interfaceManagement.ImplementationMysql;
import programingWithJava.interfaceManagement.ImplementationOracle;

/**
 *
 * @author sc
 */
public class DataAccessTest {

    public static void main(String[] args) {
        DataAccess data[] = {new ImplementationMysql(), new ImplementationOracle()};
        for (int i = 0; i < data.length; i++) {
            data[i].insert();
            data[i].list();
            data[i].update();
            data[i].delete();
        }
    }
}
