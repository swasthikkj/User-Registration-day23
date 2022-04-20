package com.junittest;

import static org.junit.Assert.*;

import org.junit.Assert;

import org.junit.Test;

import org.junit.Test.*;

public class RegexTest {
	RegexMain reg = new RegexMain();

	@Test
	public void givenFirstNameContainaCapitalLetter() {
		boolean result = reg.firstName("Swasthik");
		Assert.assertTrue(result);

	}

	@Test
	public void givenLastNameContainaCapitalLetter() {
		boolean result = reg.firstName("Kjs");
		Assert.assertTrue(result);

	}

	@Test
	public void givenEmailIsFormatted() {
		boolean result = reg.email("abc.xyx@bl.co.in");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPasswordContainoneFirstLetterOneLastLetterOneSpecialCharacter() {
		boolean result = reg.password("Swasthik999@");
		Assert.assertTrue(result);
	}
}
