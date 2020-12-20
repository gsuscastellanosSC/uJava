/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.test;
import  programingWithJava.arguments.VarArgs;
/**
 *
 * @author sc
 */
public class VarArgsTest {

    public static void main(String[] args) {
        VarArgs.showNumbers(3, 4, 5);
        VarArgs.showNumbers(1, 2);
        
        VarArgs.some("Jesús", 3, 4, 5);
    }
}
