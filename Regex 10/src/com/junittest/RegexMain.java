package com.junittest;

import java.util.regex.*;

public class RegexMain {
	public  boolean  firstName(String firstName) {

		String regexName="^[A-Z]{1}[a-z]{2}[a-z]*";
		return firstName.matches(regexName);
	}
	
	public boolean lastName(String lastName) {
		String regexName="^[A-Z]{1}[a-z]{2}[a-z]*";
		return lastName.matches(regexName);
	}
	
	public boolean email(String email) {
		String regexEmail="[a-zA-Z]+[a-zA-Z0-9]*[.]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		return email.matches(regexEmail);
	}
	
	public boolean password(String password) {
		String regexPassword="^.(?=.{8,})(?=..[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=]).$";
		return password.matches(regexPassword);
	}
}
