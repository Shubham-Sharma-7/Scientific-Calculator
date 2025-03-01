package org.esdpracticals;

import java.util.Scanner;

public class ScientificCalculator {

    public static double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of negative number is not defined");
        }
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial of negative number is not defined");
        }
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is defined for positive numbers only");
        }
        return Math.log(x);
    }

    public static double power(double x, double b) {
        return Math.pow(x, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Scientific Calculator - Choose an operation:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            if (choice == 5) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Result: " + squareRoot(num1));
                    break;
                case 2:
                    System.out.print("Enter integer: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Result: " + factorial(num2));
                    break;
                case 3:
                    System.out.print("Enter number: ");
                    double num3 = scanner.nextDouble();
                    System.out.println("Result: " + naturalLog(num3));
                    break;
                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + power(base, exponent));
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
