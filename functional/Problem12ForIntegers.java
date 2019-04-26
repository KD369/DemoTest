package com.functional;

import java.util.Arrays;

public class Problem12ForIntegers {
	
	public static void permutation(int[] a, int n) {
		if (n == 1) {
			System.out.println(Arrays.toString(a));
			return;
		}

		for (int i = 0; i < n; i++) {
			swap(a, i, n - 1);
			permutation(a, n - 1);
			swap(a, i, n - 1);
		}

	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1,2,3,4};
		int n = arr.length;
		permutation(arr,n);
		
	}

}
