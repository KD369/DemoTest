package com.Algorithm;

import java.util.Scanner;

public class DemoPalPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		
		int temp,rem,sum = 0;
		temp = n;
		while(n > 0) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n /= 10;
		}
		
		
		if(temp == sum) {
			System.out.println("Palindorme");
		}  else {
			System.out.println("Not pali");
		}
	}

}
