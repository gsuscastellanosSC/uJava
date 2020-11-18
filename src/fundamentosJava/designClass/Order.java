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

    private int idOrder;
    private Product products[];
    private static int accOrders;
    private final int MAX_PRODUCTS = 10;

    public Order() {
        this.idOrder = ++accOrders;
    }
    
    public void addProduct(Product product){
        
    }
    
    public double calculateTotal(){
        return 1;
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
