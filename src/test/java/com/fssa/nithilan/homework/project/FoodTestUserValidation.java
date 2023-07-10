package com.fssa.nithilan.homework.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FoodTestUserValidation {

	@Test

	public void testValidName() {
		Assertions.assertTrue(FoodDetailsValidator.validateName("nithilasn"));
	}

//  for invalid name
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

//  for invalid food name
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
		Assertions.assertTrue(FoodDetailsValidator.validatePincode(606207));
	}

//  for invalid Pincode
	@Test
	public void testInvalidpincode() {

		try {
			FoodDetailsValidator.validatePincode(-606207);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Pin code is: Invalid", ex.getMessage());
		}

	}

	@Test

	public void testValidprice() {
		Assertions.assertTrue(FoodDetailsValidator.validateFoodPrice(12f));
	}

//  for invalid Price
	@Test
	public void testInvalidprice() {

		try {
			FoodDetailsValidator.validateFoodPrice(00);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Food price is: Invalid", ex.getMessage());
		}

	}

	@Test

	public void testValidplace() {
		Assertions.assertTrue(FoodDetailsValidator.validateplace("ususuis"));
	}

//  for invalid Place
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
