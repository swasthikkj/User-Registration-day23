package com.userinput;

public class UserEntries {
	boolean verifyFirstName(String entry) throws InvalidEntryExceptions{
		Validate validate = new Validate();
		if(!validate.isValidFirstName(entry)){
			throw new InvalidEntryExceptions(InvalidEntryExceptions.ExceptionType.INVALID_NAME,"Invalid Name");
		}
		else {
			return validate.isValidFirstName(entry);
		}
	}

	boolean verifyLastName(String entry) throws InvalidEntryExceptions{
		Validate validate = new Validate();
		if(!validate.isValidLastName(entry)){
			throw new InvalidEntryExceptions(InvalidEntryExceptions.ExceptionType.INVALID_NAME,"Invalid Name");
		}
		else {
			return validate.isValidLastName(entry);
		}
	}

	boolean verifyMobile(String entry) throws InvalidEntryExceptions{
		Validate validate = new Validate();
		if(!validate.isValidPhone(entry)){
			throw new InvalidEntryExceptions(InvalidEntryExceptions.ExceptionType.INVALID_MOBILE,"Invalid Phone");
		}
		else {
			return validate.isValidPhone(entry);
		}
	}

	boolean verifyEMail(String entry) throws InvalidEntryExceptions{
		Validate validate = new Validate();
		if(!validate.isValidEmail(entry)){
			throw new InvalidEntryExceptions(InvalidEntryExceptions.ExceptionType.INVALID_EMAIL,"Invalid E-Mail");
		}
		else {
			return validate.isValidEmail(entry);
		}
	}

	boolean verifyPassword(String entry) throws InvalidEntryExceptions{
		Validate validate = new Validate();
		if(validate.isValidPassword(entry)){
			return validate.isValidPassword(entry);
		}
		else {
			throw new InvalidEntryExceptions(InvalidEntryExceptions.ExceptionType.INVALID_PASSWORD,"Invalid Password");
		}
	}
}
