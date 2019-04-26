package com.Algorithm;

public class Problem9 {
	
	public static void mergeSort(int[] array) {
		mergeSort(array, 0 ,array.length-1);
	}
	
	public static void mergeSort(int[] array, int left, int right) {
		if(left >= right) {
			return;
		} else {
			int mid = (left + right) / 2;
			mergeSort(array, left, mid);
			mergeSort(array,mid+1, right);
			
			mergehalves(array);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
