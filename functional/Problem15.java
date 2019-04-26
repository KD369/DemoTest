package com.functional;

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		
		
		System.out.println("Enter the Quadratic equation");
		System.out.println(a + "X^2" + "+" + b + "X+" + c);
		
		
		double d = b * b - 4 * a * c;
		
		if(d > 0) {
			System.out.println("Roots are ");
			double root1 = (float) (-b + Math.sqrt(d));
			double root2 = (float) (-b - Math.sqrt(d));
			System.out.println("Root1 --> " + root1);
			System.out.println("Root2 --> " + root2);
			
		}
		
		if(d == 0) {
			System.out.println("Roots ");
			
			double root = (-b + Math.sqrt(d));
			
			System.out.println(root);
			
			
		} else {
			System.out.println("Roots are imaginary");
		}
		
		

	}

}
