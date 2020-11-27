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
public abstract class Figure {

    protected String figureType;

    protected Figure(String figureType) {
        this.figureType = figureType;
    }

    public abstract void toDraw();

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

}
