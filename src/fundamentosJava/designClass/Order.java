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
public class Order {

    private final int idOrder;
    private Product products[];
    private static int accOrders;
    private int accPorducts;
    private static final int MAX_PRODUCTS = 10;

    public Order() {
        this.idOrder = ++Order.accOrders;
        this.products = new Product[MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        if (this.accPorducts < Order.MAX_PRODUCTS) {
            products[accPorducts++] = new Product();
        } else {
            System.out.println("Max Products Over Flow: " + Order.MAX_PRODUCTS);
        }
    }

    public double calculateTotal() {
        double ac = 0;
        for (int i = 0; i < products.length; i++) {
            ac = products[i].getCost() + ac;
        }
        return ac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order{idOrder=").append(idOrder);
        sb.append(", products=").append(products);
        sb.append(", MAX_PRODUCTS=").append(MAX_PRODUCTS);
        sb.append('}');
        return sb.toString();
    }

}
