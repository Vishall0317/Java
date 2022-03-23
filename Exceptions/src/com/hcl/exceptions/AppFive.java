
//program handles diff. types of exceptions using single try-catch

package com.hcl.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppFive {

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
		} catch (ArithmeticException | InputMismatchException | NullPointerException exception) {
			System.out.println("Exception is: " + exception);
		}
		System.out.println("program ends");

	}
}
