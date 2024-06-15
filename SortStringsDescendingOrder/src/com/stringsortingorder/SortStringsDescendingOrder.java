package com.stringsortingorder;

import java.util.Arrays; 
import java.util.Scanner; 
public class SortStringsDescendingOrder { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.println("Enter the number of strings: "); 
int n = scanner.nextInt(); 
scanner.nextLine();  // Consume newline 
String[] strings = new String[n]; 
System.out.println("Enter the strings: "); 
for (int i = 0; i < n; i++) { 
strings[i] = scanner.nextLine(); 
} 
Arrays.sort(strings, (s1, s2) -> s2.compareTo(s1)); 
System.out.println("Strings sorted in descending order: "); 
for (String str : strings) { 
System.out.println(str); 
} 
scanner.close(); 
} 
} 
