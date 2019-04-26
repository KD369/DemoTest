package com.functional;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = scanner.nextInt();
		
		int length = String.valueOf(year).length();
		if(length != 4) {
			System.out.println("Invalid year");
		} else {
			System.out.println("Valid year");
		}
		
		if(length % 4 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year");
		}
		
		

	}

}
