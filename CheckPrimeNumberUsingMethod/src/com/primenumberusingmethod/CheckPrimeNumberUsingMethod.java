package com.primenumberusingmethod;

import java.util.Scanner; 
public class CheckPrimeNumberUsingMethod { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter a number to check if it's prime: "); 
int number = scanner.nextInt(); 
boolean isPrime = checkPrime(number); 
if (isPrime) { 
System.out.println(number + " is a prime number."); 
} else { 
System.out.println(number + " is not a prime number."); 
} 
scanner.close(); 
} 
public static boolean checkPrime(int n) { 
if (n <= 1) { 
return false; 
} 
for (int i = 2; i <= Math.sqrt(n); i++) { 
if (n % i == 0) { 
return false; 
} 
} 
return true; 
} 
}