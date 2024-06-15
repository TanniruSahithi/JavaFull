package com.factorialwithmethod;

import java.util.Scanner; 
public class CalculateFactorialUsingMethod { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter a number to calculate its factorial: "); 
int number = scanner.nextInt(); 
long factorial = calculateFactorial(number); 
System.out.println("The factorial of " + number + " is: " + factorial); 
scanner.close(); 
} 
public static long calculateFactorial(int n) { 
if (n == 0 || n == 1) { 
return 1; 
} else { 
long factorial = 1; 
for (int i = 2; i <= n; i++) { 
factorial *= i; 
} 
return factorial; 
} 
} 
}
