
//program create our own exception object and throw it

package com.hcl.exceptions;

import java.util.Scanner;

public class AppEight {

//	private static Scanner scanner = null;
	private static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("program started");

		try {

			if(scanner==null) {
				throw new NullPointerException("scanner is null");
			}
			
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