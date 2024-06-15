package com.sumofsquares;

import java.util.Arrays; 
import java.util.Scanner; 
public class SumOfSquares { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.println("Enter the number of elements: "); 
int n = scanner.nextInt(); 
int[] numbers = new int[n]; 
System.out.println("Enter the elements: "); 
for (int i = 0; i < n; i++) { 
numbers[i] = scanner.nextInt(); 
} 
int sumOfSquares = Arrays.stream(numbers) 
.map(num -> num * num) 
.sum(); 
System.out.println("Sum of squares: " + sumOfSquares); 
scanner.close(); 
} 
} 
