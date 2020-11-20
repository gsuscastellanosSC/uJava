/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJavafinalLab;

/**
 *
 * @author sc
 */
public class InputPeripherals {

    private String typeInput;
    private String brand;

    public InputPeripherals(String typeInput, String brand) {
        this.typeInput = typeInput;
        this.brand = brand;
    }

    public String getTypeInput() {
        return typeInput;
    }

    public void setTypeInput(String typeInput) {
        this.typeInput = typeInput;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InputPeripherals{typeInput=").append(typeInput);
        sb.append(", brand=").append(brand);
        sb.append('}');
        return sb.toString();
    }

}
