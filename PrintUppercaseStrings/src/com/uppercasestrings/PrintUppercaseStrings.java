package com.uppercasestrings;

import java.util.Arrays; 
import java.util.List; 
public class PrintUppercaseStrings { 
public static void main(String[] args) { 
List<String> strings = Arrays.asList("apple", "orange", "banana", 
"grape"); 
// Print each string in uppercase using a lambda expression 
strings.stream() 
.map(String::toUpperCase) 
.forEach(System.out::println); 
} 
}