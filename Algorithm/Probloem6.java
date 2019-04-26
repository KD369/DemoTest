package com.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Probloem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of words");
		int numWords = scanner.nextInt();

		String[] words = new String[numWords];

		for (int i = 0; i < words.length; i++) {
			System.out.print("Words " + (i + 1) + " :");
			words[i] = scanner.next();

		}

		System.out.println("enter the word you want to search for");
		String word = scanner.next();
		Arrays.sort(words);
		int index = Arrays.binarySearch(words, word);
		System.out.println(word + "=" + index);

	}

}
