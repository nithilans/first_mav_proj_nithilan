package com.fssa.nithilan.homework.project;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FoodTestUserValidation {
	
	
	
	
	
	
	@Test

	public void testValidName() {
		Assertions.assertTrue(FoodDetailsValidator.validateName("nithilasn"));
	}
	
	
	
	
	
	
	
//  for invalid ground name
	@Test
	public void testInvalidName() {



		try {
			FoodDetailsValidator.validateName("a");
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("UserName cannot be empty or null", ex.getMessage());
		}

	}
	
	
	

	
	@Test

	public void testValidfoodName() {
		Assertions.assertTrue(FoodDetailsValidator.validateFoodName("nithilasn"));
	}
	
	
	
	
	
	
	
//  for invalid ground name
	@Test
	public void testInvalidfoodName() {



		try {
			FoodDetailsValidator.validateFoodName("a");
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Hotel name cannot be empty or null", ex.getMessage());
		}

	}
	
	
	
	@Test

	public void testValidpinecode() {
		Assertions.assertTrue(FoodDetailsValidator.validatePincode("nithilasn"));
	}
	
	
	
	
	
	
	
//  for invalid ground name
	@Test
	public void testInvalidpincode() {



		try {
			FoodDetailsValidator.validatePincode("a");
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Pin code is: Invalid", ex.getMessage());
		}

	}
	
	@Test

	public void testValiddate() {
		Assertions.assertTrue(FoodDetailsValidator.validateLocalDate("nithilasn"));
	}
	
	
	
	
	
	
	
//  for invalid ground name
	@Test
	public void testInvaliddate() {

		
		try {
			FoodDetailsValidator.validateLocalDate(null);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("date is null", ex.getMessage());
		}


		try {
			FoodDetailsValidator.validateLocalDate("a");
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("enter a date ", ex.getMessage());
		}

	}
	
	
	
	
	
	
	@Test

	public void testValidprice() {
		Assertions.assertTrue(FoodDetailsValidator.validateFoodPrice(122));
	}
	
	
	
	
	
	
	
//  for invalid ground name
	@Test
	public void testInvalidprice() {



		try {
			FoodDetailsValidator.validateFoodPrice(123);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Food price is: Invalid", ex.getMessage());
		}

	}
	
	
	
	
	
	
	

	@Test

	public void testValidplace() {
		Assertions.assertTrue(FoodDetailsValidator.validateplace("ususuis"));
	}
	
	
	
	
	
	
	
//  for invalid ground name
	@Test
	public void testInvalidplace() {

		try {
			FoodDetailsValidator.validateplace(null);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Place cannot be empty or null", ex.getMessage());
		}

		try {
			FoodDetailsValidator.validateplace("12");
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Place should be in minimum 2 letters  and maximum 30 letters", ex.getMessage());
		}

	}
	
	
	
	
	
	
	
	
	
	

	

	
}
