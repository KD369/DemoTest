package com.Algorithm;

import java.util.Scanner;

public class Problem10 {
	static int i, total;
	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
	public static void notes(int value) {
		if (value / notes[i] != 0) {
			total += (value / notes[i]);
			System.out.println(notes[i] + "-> notes :" + value / notes[i]);
			value = value % notes[i];
		}
		i++;
		if (value == 0) {
			System.out.println("total:" + total);
			return;
		}

		notes(value);

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter amoumt in Rs");
			int value = scanner.nextInt();
			notes(value);
			
		
	}

	

}
