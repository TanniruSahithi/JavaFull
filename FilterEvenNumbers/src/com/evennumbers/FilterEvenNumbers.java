package com.evennumbers;

import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner; 
import java.util.stream.Collectors; 
public class FilterEvenNumbers { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.println("Enter the number of integers: "); 
int n = scanner.nextInt(); 
List<Integer> numbers = new ArrayList<>(); 
System.out.println("Enter the integers: "); 
for (int i = 0; i < n; i++) { 
numbers.add(scanner.nextInt()); 
} 
List<Integer> evenNumbers = numbers.stream() 
.filter(num -> num % 2 == 0) 
.collect(Collectors.toList()); 
System.out.println("Even numbers: "); 
evenNumbers.forEach(System.out::println); 
scanner.close(); 
} 
}