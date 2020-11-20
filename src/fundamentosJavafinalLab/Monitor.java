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
public class Monitor {

    private int idMonitor;
    private String brand;
    private double size;
    private static int accMonitors;

    Monitor() {
        this.idMonitor = ++accMonitors;
    }

    Monitor(String brand, double size) {
        this();
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{idMonitor=").append(idMonitor);
        sb.append(", brand=").append(brand);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }

}
