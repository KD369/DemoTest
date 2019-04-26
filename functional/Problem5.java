package com.functional;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the harmonic value of n");
		int value = scanner.nextInt();

		if (value != 0) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid number");
		}

		
		double n = 1.0;
		/*
		 * double sum = 1/n; System.out.println(sum);
		 */
		double Harmonic = 1.0;
		double div = 1/n;
		
		while (n <= value) {

			Harmonic += div;

			System.out.println(Harmonic);
			n++;
		}
		

	}

}
