package com.functional;

public class demo {
	
	// Exponentiation
	
	public static int Exponentiation(int n, int p) {
		if(p <= 0) {
			return 1;
		} else{
			return n * Exponentiation(n, p-1);
		}
	}
	
	// Factorial
	public static int Factorial(int n) {
		if(n <= 1) {
			return 1;
		} else {
			return n * Factorial(n-1);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Exponentiation(2, 3));
		System.out.println(Factorial(5));
	}

}
