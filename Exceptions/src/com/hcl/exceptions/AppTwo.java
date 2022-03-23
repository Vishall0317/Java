
//program to demonstrate exception handling with try-catch block

package com.hcl.exceptions;

public class AppTwo {

	public static void main(String[] args) {

		System.out.println("program started");
		int a = 10, b = 0;

		try {

			int c = a / b;
			
			System.out.println("c value is: " + c);
		} catch (ArithmeticException arithmeticException) {
			
			System.out.println("Exception is: " + arithmeticException.getMessage());
			
		}
		System.out.println("program ends");

	}

}
