package com.Algorithm;

import java.util.Scanner;

public class Problem16 {

	public static void showArr(int[] arr) {
		// System.out.println("array is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public static boolean powerOf2(int n) {
		int i = 0, temp = (int) Math.pow(2, i);
		while (temp < n) {
			if (temp == n) {
				return true;
			}
			i++;
		}
		return false;
	}

	public static int[] swapNibbles(int[] arr) {
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

	public static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;
	}

	public static int[] toBinary(int d) {

		String binary = "";
		while (d != 0) {
			binary = (d % 2) + binary;
			d /= 2;
		}
		while (binary.length() % 4 != 0) {
			binary = 0 + binary;
		}
		return stringToIntArray(binary);
	}

	public static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter a no");
			int[] binary = toBinary(s.nextInt());
			System.out.println("binary is ");
			showArr(binary);
			s.close();
			swapNibbles(binary);
			System.out.println("after swapping ");
			showArr(binary);
			int swapDec = toDecimal(binary);
			System.out.println("decimal of swapped binary is " + swapDec);

			if (powerOf2(swapDec))
				System.out.println("its power of 2");
			else
				System.out.println("not power of 2");

		} catch (Exception e) {
			System.out.println("enter input as integer ");
		}

	}

}
