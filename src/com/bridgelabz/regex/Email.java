package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter email");
		Pattern pattern = Pattern.compile("^abc@bridgelabz");
		Matcher matcher = pattern.matcher(scanner.nextLine());
		if(matcher.matches()) {
			System.out.println("Input matches format");
		} else {
			System.out.println("Input doesn't match format");
		}
	}
}
