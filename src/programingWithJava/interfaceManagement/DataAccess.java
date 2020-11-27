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
public interface DataAccess {
    int MAX_REGISTRY = 10;
    
    void insert();
    void list();
    void update();
    void delete();
}
