package com.fssa.nithilan.homework.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserValidation {
//  for valid Username
	@Test
	public void testValidName() {
		Assertions.assertTrue(UserDetailsValidator.ValidateName("Nithilan"));
	}
	
	@Test
	public void testInvalidName() {
		try {
			UserDetailsValidator.ValidateName(null);
			Assertions.fail("Validatename failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Name cannot be empty or null", ex.getMessage());
		}
	}
//  for valid Email
	@Test
	public void testValidEmail() {
		Assertions.assertTrue(UserDetailsValidator.validateEmail("nithilan@gmail.com"));
	}
	@Test
	public void testInvalidEmail() {
		try {
			UserDetailsValidator.validateEmail(null);
			Assertions.fail("ValidateEmail failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The email address is: Invalid", ex.getMessage());
		}
	}
	@Test
	public void testValidPhoneNumber() {
		Assertions.assertTrue(UserDetailsValidator.validatePhoneNumber("9999999999"));
	}
	@Test
	public void testInvalidPhoneNumber() {
		try {
			UserDetailsValidator.validatePhoneNumber("12345");
			Assertions.fail("ValidatePhoneNumber failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals(" Phone Number length cannot be less than 10 ", ex.getMessage());
		}
	}
	@Test
	public void testValidPinCode() {
		Assertions.assertTrue(UserDetailsValidator.validatePinCode("606221"));
	}
	@Test
	public void testInvalidPinCode() {
		try {
			UserDetailsValidator.validatePinCode("000000");
			Assertions.fail("ValidatePincode failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("PinCode cannot be empty or null", ex.getMessage());
		}
	}
	@Test
	public void testValidPlace() {
		Assertions.assertTrue(UserDetailsValidator.validatePlace("Ranipet"));
	}
	@Test
	public void testInvalidPlace() {
		try {
			UserDetailsValidator.validatePlace(null);
			Assertions.fail("ValidatePlace failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Place cannot be empty or null", ex.getMessage());
		}
	}
	@Test
	public void testValidPassword() {
		Assertions.assertTrue(UserDetailsValidator.validatePassword("Nithilan@#17"));
	}
	@Test
	public void testInvalidPassword() {
		try {
			UserDetailsValidator.validateEmail(null);
			Assertions.fail("ValidatePassword failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Password cannot be empty or null", ex.getMessage());
		}
	}
}



/**
 * 
 * 
 * sgaxalijx
 * 
 */
