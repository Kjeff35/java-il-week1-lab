package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a divisor: ");
            int divisor = Integer.parseInt(sc.nextLine());

            try {
                System.out.print("Enter a dividend: ");
                int dividend = Integer.parseInt(sc.nextLine());
                int result = dividend / divisor;
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format.");
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }

    }
}