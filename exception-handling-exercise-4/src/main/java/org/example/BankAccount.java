package org.example;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance + ", Withdrawal requested: " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
