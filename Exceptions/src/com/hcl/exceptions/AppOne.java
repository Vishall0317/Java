

//program to demonstrate exception object and default handler when try-catch not present

package com.hcl.exceptions;

public class AppOne {

	public static void main(String[] args) {

		System.out.println("program started");
		int a = 10, b = 0;

		int c = a / b;
		System.out.println("c value is: " + c);
		System.out.println("program ends");
	}

}
