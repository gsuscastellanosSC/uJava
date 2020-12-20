/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.exeptionsManagement;

/**
 *
 * @author sc
 */
public class Arithmetic {

    public static int div(int x, int y) {
        if (y == 0) {
            throw new ExceptionOperation("My exception +/-oo");
        }
        return x / y;
    }
}
