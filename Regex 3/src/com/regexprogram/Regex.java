package com.regexprogram;

import java.util.Scanner;

public class Regex {
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

	public static void main(String[] args) {

		Regex regex = new Regex();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstName = scan.nextLine();
		System.out.println(regex.firstName(firstName));

		System.out.println("Enter the last name");
		String lastName = scan.nextLine();
		System.out.println(regex.firstName(lastName));

		System.out.println("Enter the email address:");
		String email = scan.nextLine();
		System.out.println(regex.email(email));
	}
}
