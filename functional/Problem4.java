package com.functional;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(args[0]);
		int powerOfTwo = 1;
		int i = 0;
		while(i < n) {
			System.out.println("2^" + i + " = " + powerOfTwo);
			powerOfTwo = 2 * powerOfTwo;
			i++;
			
		}

	}

}
