package com.hcl.CustomException;
//program to demonstrate creating custom exception.

class InvalidAgeException extends RuntimeException {

	private String message;

	public InvalidAgeException(String msg) {
		this.message = msg;
	}

	@Override
	public String toString() {
		return message;
	}

}

class AgeValidator {

	public void validateAge(int age) {

		if (age < 18) {
			throw new InvalidAgeException("Age is not sufficient.!" + age);
		} else {
			System.out.println("eligible to vote");
		}

	}

}

public class CustomException1 {

	public static void main(String[] args) {

		try {
			AgeValidator validator = new AgeValidator();
			validator.validateAge(21);
		} catch (InvalidAgeException invalidAgeException) {
			System.out.println(invalidAgeException);
		}
		
		System.out.println("program ends.");
	}

}
