package com.fssa.nithilan.homework.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FoodDetailsValidator {

	public static boolean validate(user user) {
		if (user == null) {
			throw new IllegalArgumentException("Argument Cannot be null");
		}
		validateName(user.username);
		validateFoodName(user.foodname);
		validateHotel(user.hotelname);
		validatePincode(user.pincode);
		validateplace(user.place);
		validateFoodPrice(user.foodPrice);
		return true;

	}

	public static boolean validateName(String username) throws IllegalArgumentException {

		String nameregex = "^[A-Za-z]{2,30}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(username);

		if (username == null || "".equals(username.trim()) || !matcher.matches()) {
			throw new IllegalArgumentException("UserName cannot be empty or null");
		}

		return true;

	}
	
	public static boolean validateFoodName(String foodname) throws IllegalArgumentException {

		String nameregex = "^[A-Za-z]{2,30}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(foodname);

		if (foodname == null || "".equals(foodname.trim()) || !matcher.matches()) {
			throw new IllegalArgumentException("Hotel name cannot be empty or null");
		}

		return true;

	}
	
	
	
	
	public static boolean validateHotel(String hotelname) throws IllegalArgumentException {

		String nameregex = "^[A-Za-z]{2,30}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(hotelname);

		if (hotelname == null || "".equals(hotelname.trim()) || !matcher.matches()) {
			throw new IllegalArgumentException("Hotel name cannot be empty or null");
		}

		return true;

	}
	
	// Pincode validate
			public static boolean validatePincode(int pincode) throws IllegalArgumentException {
//				String regex = "^[1-9][0-9]{5}$";
//				Pattern pattern = Pattern.compile(regex);
//				Matcher matcher = pattern.matcher(pincode);
//				Boolean isMatch = matcher.matches();
				if (pincode>0) {
					return true;
				} else {
					throw new IllegalArgumentException("Pin code is: Invalid");
				}
			}
			
			// Place validate
			public static boolean 	validateplace(String place)throws IllegalArgumentException {
				if (place == null || "".equals(place.trim())) {
					throw new IllegalArgumentException("Place cannot be empty or null");
				}
				
				String nameregex= "^[A-Za-z]{2,30}$";
				Pattern pattern = Pattern.compile(nameregex);
				Matcher matcher = pattern.matcher(place);
				Boolean isMatch = matcher.matches();
				
				if(!isMatch) {
					throw new IllegalArgumentException("Place should be in minimum 2 letters  and maximum 30 letters");
					
				}
				return true;
				
			}
			
			
			public static boolean validateFoodPrice(float foodPrice) throws IllegalArgumentException {
//				String regex = "^[1-9][0-9]{3}$";
//				Pattern pattern = Pattern.compile(regex);
//				Matcher matcher = pattern.matcher(""+foodPrice);
//				Boolean isMatch = matcher.matches();
				if (foodPrice>0) {
					return true;
				} else {
					throw new IllegalArgumentException("Food price is: Invalid");
				}
			}
			
			

}
