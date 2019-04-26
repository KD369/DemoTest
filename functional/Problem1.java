package com.functional;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		int uname = userName.length();
		
		String str1, str2,str3;

		if (uname >= 3) {
			System.out.println("Valid String");

		} else {
			System.out.println("User Name has at least 3 characters.");

		}
		
		System.out.println("Enter the String");
		str1 = scanner.nextLine();
		
		
		System.out.println("Enter the string to be replace");
		str2 = scanner.nextLine();
		
		System.out.println("Hello " + str2 + ", How are you? ");
		System.out.println("Enter the String to be replace with");
		str3 = scanner.nextLine();
		
		userName = str1.replace(str2, str3);
		System.out.println("Hello "  + userName + ", How are you?");

	}

}
