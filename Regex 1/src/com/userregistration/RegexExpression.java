package com.userregistration;

import java.util.Scanner;

public class RegexExpression {
	static String firstName = "^[A-Z]{1}[A-Za-z]{2,}$";
	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String testName = scan.nextLine();
		if(testName.matches(firstName)) {
			System.out.println("This is valid first name");
		}

		else {
			System.out.println("Not a valid name");
		}
	}
}
