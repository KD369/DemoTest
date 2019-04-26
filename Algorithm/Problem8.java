package com.Algorithm;

import java.awt.List;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");

		int elements = scanner.nextInt();
		int[] numArray = new int[elements];
		
		// traverse
		System.out.println("Traverse");
		for(int i = 0; i <= numArray.length-1; i++) {
			int temp = scanner.nextInt();
			numArray[i] = temp;
		}
		
		// bubble sort 
		
		for(int i = 0; i < elements-1; i++) {
			for(int j = 0; j < elements-i-1; j++) {
				if(numArray[j] > numArray[j+1]) {
					int temp = numArray[j];
					numArray[j] = numArray[j+1];
					numArray[j+1] = temp;
				}
			}
		}
		
		
		// print
		System.out.println("Print the array");
		for(int i = 0; i < numArray.length-1; i++) {
			System.out.println(numArray[i]);
		}
		

	}

}
