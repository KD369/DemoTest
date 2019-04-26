package com.Algorithm;

import java.util.Scanner;

public class Problem5D {
	static Scanner scanner = new Scanner(System.in);
	static int find() {

		int low = 0, high = 127, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int c = scanner.nextInt();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("guess a no between 0 to 127 ");
		scanner.next();
		try {
			System.out.println("guessed no is " + find());
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
	}
	

}
