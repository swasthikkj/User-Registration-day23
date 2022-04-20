package com.regex;

import static org.junit.Assert.*;

import org.junit.Assert;

import org.junit.Test;

import org.junit.Test.*;

public class EmailValidatorTest {

	RegexMain rev = new RegexMain();
	
	@Test
	public  void givenEmailTestNumber1(){
		boolean result = rev.email("abc@bridgelabz.co.in");
		Assert.assertTrue(result);
	}

	@Test
	public  void givenEmailTestNumber2(){
		boolean result = rev.email("abc@gmail.com.com");
		Assert.assertTrue(result);
	}

	@Test
	public  void givenEmailTestNumber3(){
		boolean result=rev.email("abc@yahoo.com");
		Assert.assertTrue(result);
	}

	@Test
	public  void givenEmailTestNumber4(){
		boolean result=rev.email("abc@1.com");
		Assert.assertTrue(result);
	}

	@Test
	public  void givenEmailTestNumber5(){
		boolean result=rev.email("abc-100@yahoo.com");
		Assert.assertTrue(result);
	}

	@Test
	public  void givenEmailTestNumber6(){
		boolean result=rev.email("abc111@abc.com");
		Assert.assertTrue(result);
	}

	@Test
	public  void givenEmailTestNumber7(){
		boolean result=rev.email("abc.100@abc.com.au");
		Assert.assertTrue(result);

	}

	@Test
	public  void givenEmailTestNumber8(){
		boolean result=rev.email("abc111@abc.com");
		Assert.assertTrue(result);
	}

	@Test
	public  void givenEmailTestNumber9(){
		boolean result=rev.email("abc111@abc.com");
		Assert.assertTrue(result);
	}

	@Test
	public  void givenEmailTestNumberFalseCase1(){
		boolean result=rev.email(".abc@abc.com");
		Assert.assertFalse(result);
	}

	@Test
	public  void givenEmailTestNumberFalseCase2(){
		boolean result=rev.email("abc");
		Assert.assertFalse(result);
	}

	@Test
	public  void givenEmailTestNumberFalseCase3(){
		boolean result=rev.email(".abc@.com.my");
		Assert.assertFalse(result);
	}

	@Test
	public  void givenEmailTestNumberFalseCase4(){
		boolean result=rev.email("abc@abc@gmail.com");
		Assert.assertFalse(result);
	}

	@Test
	public  void givenEmailTestNumberFalseCase5(){
		boolean result=rev.email("abc..2002@gmail.com");
		Assert.assertFalse(result);
	}

	@Test
	public  void givenEmailTestNumberFalseCase6(){
		boolean result=rev.email("abc123@.com");
		Assert.assertFalse(result);
	}

	@Test
	public  void givenEmailTestNumberFalseCase7(){
		boolean result=rev.email("abc123@gmail.a");
		Assert.assertFalse(result);
	}

	@Test
	public  void givenEmailTestNumberFalseCase8(){
		boolean result=rev.email("abc@%*.com");
		Assert.assertFalse(result);
	}

	@Test
	public  void givenEmailTestNumberFalseCase9(){
		boolean result=rev.email("abc@gmail.com.1a");
		Assert.assertFalse(result);
	}

	@Test
	public  void givenEmailTestNumberFalseCase10(){
		boolean result=rev.email("abc@gmail.com.aa.au");
		Assert.assertFalse(result);
	}
}
