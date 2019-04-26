package com.functional;

import java.util.Scanner;

public class Problem6Demo {

	public static void prime() {
		int count = 0;
		for (int i = 2; i <= 15; i++) {
			for (int j = 2; j <= i; j++) {
				if (j == i) {
					System.out.println(i);
					count++;
				}
				if (i % j == 0) {
					break;
				}
			}
			

		}
		 int[] primeArray = new int[count];
			int k=0;
			for (int i = 2; i <= 15; i++) {
				
				for (int j = 2; j <= i; j++) {
					if (j == i) {
						//System.out.println(i);
						while(k<i)
						{
							primeArray[k]=i;
							k++;
						}
						break;
						
					}
					if (i % j == 0) {
						break;
					}
				}
				

			}

				for( int var : primeArray)
				{
					System.out.println(var);
				}
			}

			


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter the number");
		// int number = scanner.nextInt();
		 Problem6Demo.prime();
		//prime();
		/*
		 * for(int i = 2; i * i <= number; i++) { while(number % i == 0) {
		 * System.out.println(i); number /= i; }
		 * 
		 * }
		 * 
		 */

	}

}
