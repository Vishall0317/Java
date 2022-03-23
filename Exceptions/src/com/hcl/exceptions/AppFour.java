package com.hcl.exceptions;

//program handles diff. types of exceptions using single try-catch


import java.util.Scanner;

public class AppFour {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("program started");

		try {

			System.out.println("Enter a number:");
			int a = scanner.nextInt();

			System.out.println("Enter another number:");
			int b = scanner.nextInt();

			int c = a / b;

			System.out.println("c value is: " + c);
		} catch (Exception exception) {
			System.out.println("Exception is: " + exception.getMessage());
		}
		System.out.println("program ends");

	}
}
