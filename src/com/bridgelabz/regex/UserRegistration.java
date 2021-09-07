package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pattern pattern;
		String firstName;
		Matcher matcher;

		pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		while (true) {
			System.out.println("Enter the FirstName");
			firstName = scanner.nextLine();
			if (pattern.matcher(firstName).matches()) {
				break;
			}
			System.out.println("Enter valid first name");
		}
	}
}
