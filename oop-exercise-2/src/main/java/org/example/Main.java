package org.example;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart("Cart123");
        cart.addItem("Laptop", 1000, 1);
        cart.addItem("Mouse", 50, 2);
        cart.addItem("Keyboard", 70, 1);

        System.out.println("Total Cart Amount: GHS" + cart.getTotalAmount());
    }
}