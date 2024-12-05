package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);

        try {
            account.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(200.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}