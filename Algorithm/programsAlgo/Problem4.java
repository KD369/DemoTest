package com.Algorithm;

import com.kvd.util.Utility;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility util = new Utility();

		int[] array = { 1, 2, 3, 4, 5 };

		// binary search method for integer
		System.out.println("Integer Found -> index at " + util.binarySearch(array, 0, array.length, 2));

		String str = "kalyani";
		char[] strchar = str.toCharArray();
		// binary search method for string
		System.out.println("Char found -> index at " + util.binaryString(strchar, 0, strchar.length, 'l'));

		// insertion sort for integers
		int[] num = { 3, 2, 5, 1, 6 };
		util.insertionNumbers(num);
		System.out.println("Insertion sort for integers");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		// insertion sort for string
		String word = "kalyani";
		char[] c = word.toCharArray();
		System.out.println("insertion sort for string");
		Utility.insertionString(word);
		
		// bubble sort for integers
		util.bubbleNumbers(num);
		System.out.println("Bubble sort for integers");
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		// bubble sort for strings
		System.out.println("Bubble sort for string");
		util.bubbleString(word);

	}

}
