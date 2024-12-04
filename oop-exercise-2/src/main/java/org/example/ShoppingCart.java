package org.example;

public class ShoppingCart {
    private String cartId;
    private double totalAmount;

    public ShoppingCart(String cartId) {
        this.cartId = cartId;
        this.totalAmount = 0.0;
    }

    public void addItem(String itemName, double price, int quantity) {
        Item item = new Item(itemName, price, quantity);
        double itemTotal = item.calculateTotal();
        this.totalAmount += itemTotal;
        System.out.println("Added " + itemName + " (Qty: " + quantity + ") - Total: GHS" + itemTotal);
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Inner Class
    private class Item {
        private final String itemName;
        private final double price;
        private final int quantity;

        public Item(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        public double calculateTotal() {
            return price * quantity;
        }
    }

}

