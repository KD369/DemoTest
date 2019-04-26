package com.functional;

import java.util.Arrays;

public class Problem12 {

	public static void permutation(String str, String word) {

		if (word.isEmpty()) {
			System.out.println(str + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				permutation(str + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}

	public static void permutation(String input) {
		permutation(" ", input);
	}

	/*
	 * private static String swap(String str, int i, int j) { // TODO Auto-generated
	 * method stub char[] charArray = str.toCharArray(); char temp = charArray[i];
	 * charArray[i] = charArray[j]; charArray[j] = temp;
	 * 
	 * return String.valueOf(charArray);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		permutation("ABCD");
	}

}
