package com.example.assignments.six;

public class Assignment6 {
	/**
	 * PROBLEM 1
	 *this is add method, which takes two positive integers and returns their sum in recursion technique
	 * @param a
	 * @param b
	 * @return
	 */
	public int addMethod(int a,int b){
		if(b==0) return a;
		return addMethod(a+1, b-1);		
	}
	
	/**
	 * a recursive method to calculate the sum of squares of the first n natural numbers. 
	 * n is to be given as an input.
	 * @param n:is to be given as an input. 
	 * @return:the sum of squares of the first n natural numbers
	 */
	public int sumOfSquare(int n){
		if(n==1) return 1;
		return (n*n)+ sumOfSquare(n-1);
		
		
	}
	public static void main(String[] args) {
		//System.out.println(new Assignment6().addMethod(2, 3));
		System.out.println(new Assignment6().sumOfSquare(3));

	}
	
}
