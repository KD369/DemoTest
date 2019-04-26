package com.Algorithm;

import java.util.Scanner;

public class Problem5 {
	static Scanner scanner = new Scanner(System.in);
//	static int num = scanner.nextInt();

	public static int Search(int n, int low, int high) {

		if (high >= low) {
			int mid = low + (high - low) / 2;

			if (n == num) {
				return mid;
			}

			if (n > num) {
				return Search(n, low, mid - 1);
			} else {
				return Search(n, mid + 1, high);
			}

		}
		return -1;

	}

	public void play() {
		while (true) {

			int move = scanner.nextInt();

			if (num < move) {
				System.out.println("Your number is too small");
			} else if (num > move) {
				System.out.println("Your number is too big");
			} else {
				System.out.println("You got it bro!!");
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem5 p = new Problem5();

		int n = Integer.parseInt(args[0]);
		int N = (int) Math.pow(2, n);
		
		//System.out.println("N is " + N);
		int check = Search(N, 0, N - 1, n);

		p.play();
		
		if(check == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("Found!!");
		}

	}

}
