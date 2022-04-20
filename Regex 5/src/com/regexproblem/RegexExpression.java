package com.regexproblem;

import java.util.Scanner;

public class RegexExpression {
	public boolean firstName(String name) {
		String firstName = "^[A-Z]{1}[A-Za-z]{2,}$";
		if (name.matches(firstName)) {
			return true;
		}

		return false;
	}

	public boolean lastName(String name) {
		String lastName = "^[A-Z]{1}[A-Za-z]{2,}$";
		if (name.matches(lastName)) {
			return true;
		}

		return false;
	}

	public boolean email(String email) {
		String pattern  = "^(abc)[.]{1}[A-Za-z][@]{1}(bl.co)(.in)$";
		if (email.matches(pattern)) {
			return true;
		}

		return false;
	}

	public boolean mobile(String mobile) {
		String pattern  = "^(91)[\\s]{1}[1-9]{1}[0-9]{9}$";
		if (mobile.matches(pattern)) {
			return true;
		}

		return false;
	}

	public boolean password(String password) {
		String pattern  = "^[a-zA-Z0-9]{8,}$";
		if (password.matches(pattern)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		RegexExpression regex = new RegexExpression();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstName = scan.nextLine();
		System.out.println(regex.firstName(firstName));

		System.out.println("Enter the last name");
		String lastName = scan.nextLine();
		System.out.println(regex.firstName(lastName));

		System.out.println("Enter the email address");
		String email = scan.nextLine();
		System.out.println(regex.email(email));

		System.out.println("Enter the mobile number");
		String mobile = scan.nextLine();
		System.out.println(regex.mobile(mobile));

		System.out.println("Enter the password");
		String password = scan.nextLine();
		System.out.println(regex.password(password));
	}
}

