package com.factorial;

import java.util.Scanner;

public class FactorialofaNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Call the recursive factorial method
        int factorial = factorialRecursive(n);

        System.out.println("Factorial of " + n + " is: " + factorial);

        scanner.close();
    }

    // Recursive method to calculate factorial
    private static int factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
}
