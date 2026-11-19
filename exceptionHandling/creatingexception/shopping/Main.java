package exceptionHandling.creatingexception.shopping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available stock: ");
        Shopping shop = new Shopping(sc.nextInt());

        System.out.print("Enter requested quantity: ");
        int qty = sc.nextInt();

        try {
            shop.placeOrder(qty);
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
