package com.hcl.exceptions1;

//program to demonstrate use of Nested try
import java.util.Scanner;

public class AppOne {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		try {

			try {
				System.out.println("enter a number:");
				int x = scanner.nextInt();

				System.out.println("enter another:");
				int y = scanner.nextInt();

				int z = x / y;
				System.out.println("z is: " + z);
			} catch (Exception e) {
				System.out.println("exception in inner try:" + e.getMessage());
			}

		} catch (ArithmeticException e) {
			System.out.println("exception in outer try: " + e.getMessage());
		}

	}

}
