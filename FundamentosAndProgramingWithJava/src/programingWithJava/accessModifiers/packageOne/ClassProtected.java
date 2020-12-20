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
public class ClassProtected {

    protected String ProtectedAttribute = "Protected Attribute Value...";

    public ClassProtected(String type) {
        System.out.println("        Running " + type + " builder");
    }

    protected ClassProtected() {
        System.out.println("        Running Protected builder");
    }

    protected void methodProtected() {
        System.out.println("        Running Protected method...");
    }
}
