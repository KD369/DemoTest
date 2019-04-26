package com.Algorithm;

public class Problem15 {

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
		System.out.println(toBinary(5));
	}

}
