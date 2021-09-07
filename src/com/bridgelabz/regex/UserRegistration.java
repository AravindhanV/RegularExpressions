package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static boolean validateName(String name) {
		Pattern pattern;
		pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		return pattern.matcher(name).matches();
	}
	
	public static boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile("abc(\\.xyz)?@bl\\.co(\\.in)?");
		return pattern.matcher(email).matches();
	}
	
	public static boolean validatePassword(String password) {
		Pattern pattern = Pattern.compile(".{7,}");
		if(!pattern.matcher(password).matches()) {
			return false;
		}
		
		pattern = Pattern.compile(".*[A-Z].*");
		if (!pattern.matcher(password).matches()) {
			return false;
		}
		
		pattern = Pattern.compile(".*\\d.*");
		if (!pattern.matcher(password).matches()) {
			return false;
		}
		
		pattern = Pattern.compile("^[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$");
		if (!pattern.matcher(password).matches()) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String firstName,lastName,email,password;
		Matcher matcher;

		
		System.out.println("Enter the FirstName");
		while (true) {
			firstName = scanner.nextLine();
			if (validateName(firstName)) {
				break;
			}
			System.out.println("Enter valid first name");
		}
		
		System.out.println("Enter the Last Name");
		while (true) {
			lastName = scanner.nextLine();
			if (validateName(lastName)) {
				break;
			}
			System.out.println("Enter valid last name");
		}
			
		System.out.println("Enter the email");
		while (true) {
			email = scanner.nextLine();
			if (validateEmail(email)) {
				break;
			}
			System.out.println("Enter valid email");
		}
		
		System.out.println("Enter the password");
		while (true) {
			password = scanner.nextLine();
			if (validatePassword(password)) {
				break;
			}
			System.out.println("Enter valid password");
		}
	}
}
