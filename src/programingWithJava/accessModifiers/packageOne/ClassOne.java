/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.accessModifiers.packageOne;

/**
 *
 * @author sc
 */
public class ClassOne {

    public String PublicAttribute = "Public Attribute Value...";

    public ClassOne() {
        System.out.println("Running public builder");
    }
    
    public void methodPublic(){
        System.out.println("Running public method...");
    }
}
