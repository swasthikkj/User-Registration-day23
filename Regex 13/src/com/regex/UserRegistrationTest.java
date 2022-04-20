package com.regex;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class UserRegistrationTest {
	    UserRegistration userRegistration = new UserRegistration();
	    @Test
	    public void givenFirstName_whenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.firstNameValidate.userEntries("Akshara");
	            Assert.assertTrue(result);
	        } catch (InvalidUserInputException e) {
	            System.out.println(e);
	        }
	    }
		Function<List<String>, List<Boolean>> firstNameTestCases = cases -> cases.stream().map(x -> {
			try {
				return userRegistration.firstNameValidate.userEntries(x);
			} 
			catch (InvalidUserInputException e) {


			}
			return false;
		}).collect(Collectors.toList());

	    @Test
	    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.firstNameValidate.userEntries("Ak");
	            Assert.assertFalse(result);
	        } catch (InvalidUserInputException e) {
	            System.out.println(e);
	        }
	    }
		Function<List<String>, List<Boolean>> emailTestCases = cases -> cases.stream().map(x -> {
			try {
				return userRegistration.emailValidate.userEntries(x);
			} catch (InvalidUserInputException e) {
				
			}
			return false;
		}).collect(Collectors.toList());

	    @Test
	    public void givenLastName_whenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.lastNameValidate.userEntries("Phalake");
	            Assert.assertTrue(result);
	        } catch (InvalidUserInputException e) {
	            System.out.println(e);
	        }
	    }
		Function<List<String>, List<Boolean>> phoneTestCases = cases -> cases.stream().map(x -> {
			try {
				return userRegistration.phoneNumberValidate.userEntries(x);
			} catch (InvalidUserInputException e) {
			
			}
			return false;
		}).collect(Collectors.toList());

	    @Test
	    public void givenLastName_whenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.lastNameValidate.userEntries("pha");
	            Assert.assertFalse(result);
	        } catch (InvalidUserInputException e) {
	            System.out.println(e);
	        }
	    }
		Function<List<String>, List<Boolean>> passwordTestCases = cases -> cases.stream().map(x -> {
			try {
				return userRegistration.passwordValidate.userEntries(x);
			} catch (InvalidUserInputException e) {

			}
			return false;
		}).collect(Collectors.toList());

	    @Test
	    public void givenEmail_whenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.emailValidate.userEntries("abc.xyz@bl.co.in");
	            Assert.assertTrue(result);
	        } catch (InvalidUserInputException e) {
	            System.out.println(e);
	        }
	    }
		@Test
		public void test_firstName_Cases() {
			List<Boolean> result = firstNameTestCases.apply(Arrays.asList("Jayesh", "Akshara", "Nikita", "Neha", "sdfs"));
			List<Boolean> expected = Arrays.asList(true, true, true, true, false);
			assertEquals(expected, result);
		}

	    @Test
	    public void givenEmail_whenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.emailValidate.userEntries("abc.xyz@bl.in");
	            Assert.assertFalse(result);
	        } catch (InvalidUserInputException e) {
	            System.out.println(e);
	        }
	    }
		@Test
		public void test_lastName_Cases() {
			List<Boolean> result = lastNameTestCases.apply(Arrays.asList("Dahiwale", "Phalake", "Chougule", "Chougule", "dvsd"));
			List<Boolean> expected = Arrays.asList(true, true, true, true, false);
			assertEquals(expected, result);
		}

	    @Test
	    public void givenPhone_whenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.phoneNumberValidate.userEntries("91 9863632323");
	            Assert.assertTrue(result);
	        } catch (InvalidUserInputException e) {
	            System.out.println(e);
	        }
	    }
		@Test
		public void test_email_Cases() {
			List<Boolean> result = emailTestCases.apply(Arrays.asList("abc@1.com", "abc@2.com", "abc@3.com", "abc@4.com", "sdvs@"));
			List<Boolean> expected = Arrays.asList(true, true, true, true, false);
			assertEquals(expected, result);
		}

	    @Test
	    public void givenPhone_whenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.phoneNumberValidate.userEntries("9123723");
	            Assert.assertFalse(result);
	        } catch (InvalidUserInputException e) {
	            System.out.println(e);
	        }
	    }
		@Test
		public void test_phoneNumber_Cases() {
			List<Boolean> result = phoneTestCases.apply(Arrays.asList("91 7066944829", "91 7447855795", "91 8180908638", "91 9657475623", "2354453454"));
			List<Boolean> expected = Arrays.asList(true, true, true, true, false);
			assertEquals(expected, result);
		}

	    @Test
	    public void givenPassword_whenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.passwordValidate.userEntries("Aksh@8520");
	            Assert.assertTrue(result);
	        } catch (InvalidUserInputException e) {
	            System.out.println(e);
	        }
	    }
		@Test
		public void test_password_Cases() {
			List<Boolean> result = passwordTestCases.apply(Arrays.asList("Jayesh@2017", "Akshara@2017", "Nikita@2017", "Neha@2017", "sdfs@2017"));
			List<Boolean> expected = Arrays.asList(true, true, true, true, false);
			assertEquals(expected, result);
		}

	    @Test
	    public void givenPassword_whenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.passwordValidate.userEntries("Aks231#%");
	            Assert.assertFalse(result);
	        } catch (InvalidUserInputException e) {
	            System.out.println(e);
	        }
	    }
}
