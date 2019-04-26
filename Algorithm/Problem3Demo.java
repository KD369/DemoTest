package com.Algorithm;

import java.util.Scanner;

public class Problem3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num  = scanner.nextInt();
		int sum = 0,c = 0;
		int rev = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) 
			c++;
		}
		if(c == 2)
		rev = num;
		while(rev > 0) {
			int r = rev % 10;
			sum = (sum * 10) + r;
			rev /= 10;
		}
		
		if(num == sum) {
			System.out.println("PalPrime");
		} else {
			System.out.println("Not palPrime");
		}
		
	}

}
