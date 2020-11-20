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
public class TestPc {

    public static void main(String[] args) {
        Order oRderOne = new Order();
        Pc pc1 = new Pc("PcOne", new Monitor("HP", 20.000), new KeyBoard("Key Board", "HP"), new Mouse("Mouse", "Compaq"));
        oRderOne.addPc(pc1);
        oRderOne.showOrder();

    }
}
