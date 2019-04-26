package com.Algorithm;

import java.util.Arrays;

public class Problem3 {
	
	public static void primeNum() {
		for(int i = 2; i <= 10; i++) {
			for(int j = 2; j <= i; j++) {
				if(j == i) {
					System.out.println(i);
				} 
				
				if(i % j == 0) {
					break;
				}
			}
		}
	}
	
	
	public static boolean prime(int[] numArr1, int[] numArr2) {
		
		for(int i = 2; i <= numArr1.length; i++) {
			for(int j = 2; j <= i; j++) {
				if(j == i) {
					return false;
				}
				
				if(i % j == 0) {
					break;
				}
			}
			
			
		}
		return false;
	}
	
	
	
	
	// anagram
	public static boolean numAnagrams(int[] num1 , int[] num2) {
		int LenNum1 = num1.length;
		int LenNum2 = num2.length;
		
		if(LenNum1 != LenNum2) {
			return false;
		}
		
		Arrays.sort(num1);
		Arrays.sort(num2);
		
		
		for(int i = 0; i < LenNum1; i++) {
			if(num1[i] != num2[i]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {5,3,2,1,4};
		
		if(numAnagrams(arr1, arr2)) {
			System.out.println("Both numbers are anagram of each other");
		} else {
			System.out.println("Both numbers are not anagram of each other");
		}
		
		
		primeNum();
		
		
		

	}

}
