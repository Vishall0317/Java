package com.hcl.exceptions;


//program handles ArrayIndexOutOfBoundsException

public class AppSix {

	public static void main(String[] args) {

		System.out.println("program started");

		int array[] = { 10, 20, 30, 40 };

		try {
			for (int i = 0; i <= array.length; i++) {

				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException exception) {

			System.out.println("exception is came at index: " + exception.getMessage());
		}

		System.out.println("program ends");
	}
}
