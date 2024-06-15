package com.averagearrayelementsusingmethod;

import java.util.Scanner; 
public class CalculateAverageofArrayElementsUsingMethod { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter the number of elements in the array: "); 
int size = scanner.nextInt(); 
int[] arr = new int[size]; 
System.out.println("Enter the elements of the array:"); 
for (int i = 0; i < size; i++) { 
arr[i] = scanner.nextInt(); 
} 
double average = calculateAverage(arr); 
System.out.println("The average of the array elements is: " + average); 
scanner.close(); 
} 
public static double calculateAverage(int[] arr) { 
if (arr.length == 0) { 
return 0; // Return 0 if the array is empty 
} 
int sum = 0; 
for (int num : arr) { 
sum += num; 
} 
return (double) sum / arr.length; 
} 
}