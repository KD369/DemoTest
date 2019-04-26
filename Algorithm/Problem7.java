package com.Algorithm;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");

		String word = scanner.nextLine();

		char[] wordArray = word.toCharArray();

		// traverse
		for (int i = 0; i <= wordArray.length - 1; i++) {
			System.out.println(wordArray[i]);
		}

		// insertion
		int j;
		for (int i = 1; i < wordArray.length; i++) {
			int key = wordArray[i];
			for (j = i - 1; j >= 0 && wordArray[j] > key; j--) {
				wordArray[j + 1] = wordArray[j];

			}
			wordArray[j + 1] = (char) key;
		}
		
		// print
		System.out.println("Print the array");
		for(int i = 0; i < wordArray.length-1; i++) {
			System.out.print(wordArray[i] + " ");
		}
		

	}
}
