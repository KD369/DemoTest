package com.functional;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		if(number >= 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is negative");
		}
		int head = 0;
		int count = 0;
		
		while(count < number) {
			double result = Math.random();
			if(result  < 0.5) {
				System.out.println("Tails");
				
			} else {
				System.out.println("Heads");
				head++;
			}
		}
		
		
		double head_percent = ((head / number) * 100) ;
		System.out.println("Head Percent " + head_percent);
		
		
		System.out.println("random number " + Math.random());
		
		
		
		
		
	
		
	}

}
