package com.Algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem6String {

	public static void binarySearchWord(String string[], int size) {

		Scanner scanner = new Scanner(System.in);
		int low = 0, high = size - 1;
		int mid;
		System.out.println("Enter String for search :");
		String str = scanner.next();
		mid = (low + high) / 2;
		while (low <= high) {

			if (string[mid].compareTo(str) == 0) {
				System.out.println("word found " + string[mid] + " at index  " + (mid));
				break;
			} else if (string[mid].compareTo(str) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		if (low > high) {
			System.out.println("Word not found :");
		}
	}

	public static String[] bubbleSortword(String string[], int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (string[i].compareTo(string[j]) < 0) {
					String string2 = string[i];
					string[i] = string[j];
					string[j] = string2;
				}
			}
		}
		System.out.println("Sorted String :");
		for (int i = 0; i < size; i++) {
			System.out.println(string[i]);
		}
		return string;

	}

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("file1.txt");
		Scanner scanner = new Scanner(file);
		int len = (int) file.length();
		String string[] = new String[len];
		int i = 0;
		while (scanner.hasNext()) {

			String s = scanner.next();
			string[i] = s;
			i++;

		}
		for (int j = 0; j < i; j++) {

			System.out.println(string[j]);
		}
		string = Problem6String.bubbleSortword(string, i);

		Problem6String.binarySearchWord(string, i);

	}

}
