package com.fssa.nithilan.homework.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserValidation {
//  for valid Username
	@Test
	public void testValidName() {
		Assertions.assertTrue(UserDetailsValidator.ValidateName("Nithilan"));
	}
//  for valid Email
	@Test
	public void testValidEmail() {
		Assertions.assertTrue(UserDetailsValidator.validateEmail("nithilan@gmail.com"));
	}
	@Test
	public void testValidPhoneNumber() {
		Assertions.assertTrue(UserDetailsValidator.validatePhoneNumber("9999999999"));
	}
	@Test
	public void testValidPinCode() {
		Assertions.assertTrue(UserDetailsValidator.validatePinCode("606221"));
	}
	@Test
	public void testValidPlace() {
		Assertions.assertTrue(UserDetailsValidator.validatePlace("Ranipet"));
	}
	@Test
	public void testValidPassword() {
		Assertions.assertTrue(UserDetailsValidator.validatePassword("Nithilan@#17"));
	}
}
