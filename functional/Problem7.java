package com.functional;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int stake = Integer.parseInt(args[0]); int goal = Integer.parseInt(args[1]);
		 * int number_trails = Integer.parseInt(args[2]);
		 * 
		 */		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Stake");
		int stake = scanner.nextInt();
		
		System.out.println("Enter the goal");
		int goal = scanner.nextInt();
		
		System.out.println("Enter the number of trials");
		int number_trails = scanner.nextInt();
		
		int bet = 0;
		int win = 0;
		
		for(int t = 0; t < number_trails; t++) {
			int cash = stake;

			while(cash > 0 && cash < goal) {
				float randNum = (float) Math.random();
			
				if( randNum < 0.5) {
					
					cash++;
				} else {
					cash--;
				}
				if(cash == goal) {
					win++;
				}
			}	
		}
				System.out.println(win + " wins of " + number_trails);
				System.out.println("Percent of the game =" + 100.0 * win / number_trails);
				System.out.println("Avg = " + 1.0 * bet / number_trails);
					
			
		}
		

	}


