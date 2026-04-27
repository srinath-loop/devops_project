package com.example;

public class App {
    public static void main(String[] args) {

        System.out.println("=== Simple Calculator ===");

        // Instead of Scanner input
        double a = 10;
        double b = 5;
        int choice = 1; // change this to test different operations

        double result = 0;

        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Addition: " + result);
                break;

            case 2:
                result = a - b;
                System.out.println("Subtraction: " + result);
                break;

            case 3:
                result = a * b;
                System.out.println("Multiplication: " + result);
                break;

            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Division: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
