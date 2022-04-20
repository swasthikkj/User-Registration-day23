package com.userinput;

import java.util.regex.*;

class Validate {
	static Regexes regex = Regexes.getInstance();
		public boolean isValidFirstName(String str) {
			if (str == null) {
				return false;
			}
			
			return Pattern.matches(regex.validateFirstName, str);
		}
		
		public boolean isValidLastName(String str){
			if (str == null) {
				return false;
			}
			
			return Pattern.matches(regex.validateLastName, str);
		}
		
		public boolean isValidEmail(String str){
			if (str == null) {
				return false;
			}
			
			return Pattern.matches(regex.validateEmail, str);
		}
		
		public boolean isValidPhone(String str){
			if (str == null) {
				return false;
			}
			
			return Pattern.matches(regex.validatePhone, str);
		}
		
		public boolean isValidPassword(String str){
			if (str == null) {
				return false;
			}
			
			return Pattern.matches(regex.validatePassword, str);
		}

	}
