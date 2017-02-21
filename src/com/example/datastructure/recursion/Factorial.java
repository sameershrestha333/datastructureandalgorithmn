package com.example.datastructure.recursion;

public class Factorial {
	/*
	 * this method takes one integer item and return its factorial
	 * 
	 */

	public static int factorial(int n) {
		if(n==0) return 1;
		
		return n * factorial(n - 1);

	}

	public static void main(String[] args) {
		System.out.println(factorial(3));
	}
}
