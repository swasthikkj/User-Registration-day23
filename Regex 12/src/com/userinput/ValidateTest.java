package com.userinput;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class ValidateTest {

	Validate validate = new Validate();

	@Test
	void givenFirstName_beingValid_shouldReturnTrue() {

		Assertions.assertTrue(validate.isValidFirstName("SWASTHIK"));
		Assertions.assertTrue(validate.isValidFirstName("Swasthik"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertTrue(userInput.verifyFirstName("SWASTHIK"));
			Assertions.assertTrue(userInput.verifyFirstName("Swasthik"));
		}
		catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	void givenFirstName_beingInValid_shouldReturnFalse(){
		Assertions.assertFalse(validate.isValidFirstName("swasthik"));
		Assertions.assertFalse(validate.isValidFirstName("1swasthik"));
		Assertions.assertFalse(validate.isValidFirstName("Sw"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertFalse(userInput.verifyFirstName("swasthik"));
			Assertions.assertFalse(userInput.verifyFirstName("1swasthik"));
			Assertions.assertFalse(userInput.verifyFirstName("Sw"));
		}
		catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	void givenLastName_beingValid_shouldReturnTrue() {
		Assertions.assertTrue(validate.isValidLastName("KUMAR"));
		Assertions.assertTrue(validate.isValidLastName("Kumar"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertTrue(userInput.verifyLastName("KUMAR"));
			Assertions.assertTrue(userInput.verifyLastName("Kumar"));
		} 
		catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	void givenLastName_beingInValid_shouldReturnFalse(){
		Assertions.assertFalse(validate.isValidLastName("swasthik"));
		Assertions.assertFalse(validate.isValidLastName("1swasthik"));
		Assertions.assertFalse(validate.isValidLastName("Sw"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertFalse(userInput.verifyLastName("swasthik"));
			Assertions.assertFalse(userInput.verifyLastName("1swasthik"));
			Assertions.assertFalse(userInput.verifyLastName("Sw"));
		} 
		catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	void  givenEmail_beingValid_shouldReturnTrue() {
		Assertions.assertTrue(validate.isValidEmail("abc.xyz@bl.co.in"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertTrue(userInput.verifyEMail("abc.xyz@bl.co.in"));
		} 
		catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenEmail_beingInValid_ShouldReturnFalse() {
		Assertions.assertFalse(validate.isValidEmail("abc.xyz@bl.au.aa.in"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertFalse(userInput.verifyEMail("abc.xyz@bl.au.aa.in"));
		} 
		catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenPhone_beingValid__ShouldReturnTrue() {
		Assertions.assertTrue(validate.isValidPhone("91 1234567890"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertTrue(userInput.verifyMobile("91 1234567890"));
		}
		catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenPhone_beingInValid_ShouldReturnFalse() {
		Assertions.assertFalse(validate.isValidPhone("1234543210"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertFalse(userInput.verifyMobile("1234543210"));
		} 
		catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenPassword_beingValid__ShouldReturnTrue() {
		Assertions.assertTrue(validate.isValidPassword("Abcd@123"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertTrue(userInput.verifyPassword("Abcd@123"));
		}
		catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenPassword_beingInValid_ShouldReturnFalse() {
		Assertions.assertFalse(validate.isValidPassword("Pi32oh#%"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertFalse(userInput.verifyPassword("Pi32oh#%"));
		} 
		catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}
}
