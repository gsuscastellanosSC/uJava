/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava.finalLab;

/**
 *
 * @author sc
 */
public class Pc {

    private final int idPc;
    private String name;
    private Monitor monitor;
    private KeyBoard keyBoard;
    private Mouse mouse;
    private static int accPc;

    private Pc() {
        this.idPc = ++Pc.accPc;
    }

    public Pc(String name, Monitor monitor, KeyBoard keyBoard, Mouse mouse) {
        this();
        this.name = name;
        this.monitor = monitor;
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

    public int getIdPc() {
        return idPc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public static int getAccPc() {
        return accPc;
    }

    public static void setAccPc(int aAccPc) {
        accPc = aAccPc;
    }

    @Override
    public String toString() {
        return "Pc{" + "idPc=" + this.idPc + ", name=" + this.name + ", monitor=" + monitor + ", keyBoard=" + keyBoard + ", mouse=" + mouse + '}';
    }

}
