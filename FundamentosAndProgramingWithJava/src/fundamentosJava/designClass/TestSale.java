/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava.designClass;

import java.util.Scanner;

/**
 *
 * @author sc
 */
public class TestSale {

    public static void main(String[] args) {
        String productName;
        Double productCost;
        Order order1 = new Order();
        Scanner sc = new Scanner(System.in);
        int validate = 1;
        while (validate == 1) {
            System.out.print("Please Add name of Product: ");
            productName = sc.nextLine();
            System.out.print("\nPlease Add cost of Product $");
            productCost = Double.parseDouble(sc.nextLine());
            Product product1 = new Product(productName, productCost);
            order1.addProduct(product1);
            System.out.println("Do you want add more produtcs?");
            System.out.println("Not(0) Yes(1)");
            validate = Integer.parseInt(sc.nextLine());
            order1.showOrder();
        }
    }
}
