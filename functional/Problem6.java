package com.functional;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		for(int i = 2; i <= number; i++) {
			while(number % i == 0) {
				System.out.println(i);
				number /= i;
			}
		}
		
		

	}

}
