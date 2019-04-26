package com.Algorithm;

import java.util.Arrays;

public class Problem1 {
	
	public static boolean AnagramChecking(String str1 , String str2) {
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		
		int stringLen1 = string1.length;
		int stringLen2 = string2.length;
		
		if(stringLen1 != stringLen2) {
			return false;
		} 
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		
		for(int i = 0; i < stringLen1; i++) {
			if(string1[i] != string2[i]) {
				return false;
			} 
		
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		if(AnagramChecking("listen", "silent")) {
			System.out.println("Two Strings are anagram of each other");
		} else {
			System.out.println("Given two strings are not anagram of each other");
		}
	}

}
