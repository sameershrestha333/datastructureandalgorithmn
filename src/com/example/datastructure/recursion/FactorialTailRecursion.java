package com.example.datastructure.recursion;

public class FactorialTailRecursion {
	/**
	 * this take two paramter and return the factorial
	 * @param n: takes int type of parameter.
	 * @param result it is the accumulator which holds the values of previous calcualtions.
	 * @return: return int type of data.
	 */
	

	public static int factorial(int n,int result) {
		if(n==0) return result;
		
		return factorial(n-1, n* result);

	}

	public static void main(String[] args) {
		System.out.println(factorial(3,1));
	}
}
