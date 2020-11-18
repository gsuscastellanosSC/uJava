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
            products[accPorducts++] = product;
        } else {
            System.out.println("Max Products Over Flow: " + Order.MAX_PRODUCTS);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < this.accPorducts; i++) {
            total += this.products[i].getCost();
        }
        return total;
    }

    public void showOrder() {
        System.out.println("Id Order: " + this.idOrder);
        System.out.println("Total Order: $" + this.calculateTotal());
        System.out.println("Products into the Order: ");
        for (int i = 0; i < this.accPorducts; i++) {
            System.out.println(this.products[i]);
        }
    }

}
