package com.example.pratice.Introduction;

public class GCDFinder {
	/**
	 * this method takes two +ve integer and return their gcd using
	 * Euclid's Algorith
	 * @param m
	 * @param n
	 * @return
	 */
	
	public int findGCD(int m,int n){
		
		if(n==0){
			return m;
		}
		else return findGCD(n, m%n);	
		
	}

	public static void main(String[] args) {
		//anonymous object which donot have reference variable.
		System.out.println(new GCDFinder().findGCD(205, 10));
	}

}
