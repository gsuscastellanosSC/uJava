/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava.designClass;

/**
 *
 * @author sc
 */
public class Product {

    private final int idProduct;
    private String name;
    private double cost;
    private static int accProducts;

    public Product() {
        this.idProduct = ++Product.accProducts;
    }

    public Product(String name, double cost) {
        this();
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public static int getAccProducts() {
        return accProducts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", name=" + name + ", cost=" + cost + '}';
    }

}
