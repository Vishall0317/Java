package com.hcl.exceptions1;

//program to demonstrate use of Throwable method:  getStackTrace

import java.util.Scanner;

class BankAppp {

	public void m3(Scanner scanner) {
		System.out.println("enter a number:");
		int x = scanner.nextInt();

		System.out.println("enter another:");
		int y = scanner.nextInt();

		int z = x / y;
		System.out.println("z is: " + z);

	}

}

class Flipkartt {

	public void m2(Scanner scanner) {
		BankAppp obj = new BankAppp();
		obj.m3(scanner);
	}

}

class Customerr {

	public void m1(Scanner scanner) {
		Flipkartt obj = new Flipkartt();
		obj.m2(scanner);
	}

}

public class AppThree {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			Customerr obj = new Customerr();

			obj.m1(scanner);

		} catch (Exception e) {
			System.out.println("exception is:" + e.getMessage());
			
			StackTraceElement[] stackTrace = e.getStackTrace();
			for(StackTraceElement ele:stackTrace) {
//				System.out.println(ele.getClassName()+" "+ele.getLineNumber()+"  "+ele.getMethodName());
				System.out.println(ele);
			}
		}
		
		System.out.println("program ends");

	}
}

//	customer-----------------> Flipkart------------------> PaymentGateway-----------------> Bank App
