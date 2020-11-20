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
public class KeyBoard extends InputPeripherals {

    private int idKeyBoard;
    private static int accKeyBoard;

    public KeyBoard(String typeInput, String brand) {
        super(typeInput, brand);
        this.idKeyBoard = ++accKeyBoard;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyBoard{idKeyBoard=").append(idKeyBoard);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
