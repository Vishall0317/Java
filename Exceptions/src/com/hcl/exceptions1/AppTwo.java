package com.hcl.exceptions1;

//program to demonstrate use of Throwable method:printStackTrace

import java.util.Scanner;

class BankApp {

	public void m3(Scanner scanner) {
		System.out.println("enter a number:");
		int x = scanner.nextInt();

		System.out.println("enter another:");
		int y = scanner.nextInt();

		int z = x / y;
		System.out.println("z is: " + z);

	}

}

class Flipkart {

	public void m2(Scanner scanner) {
		BankApp obj = new BankApp();
		obj.m3(scanner);
	}

}

class Customer {

	public void m1(Scanner scanner) {
		Flipkart obj = new Flipkart();
		obj.m2(scanner);
	}

}

public class AppTwo {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			Customer obj = new Customer();

			obj.m1(scanner);

		} catch (Exception e) {
			System.out.println("exception is:" + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("program ends");

	}
}

//	customer-----------------> Flipkart------------------> PaymentGateway-----------------> Bank App
