/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.abstractClass;

/**
 *
 * @author sc
 */
public class Rectangle extends Figure {

    public Rectangle(String figureType) {
        super(figureType);
    }

    public void draw() {
        System.out.println("        Draw: " + this.getClass().getSimpleName());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", " + figureType);
        sb.append('}');
        return sb.toString();
    }

}
