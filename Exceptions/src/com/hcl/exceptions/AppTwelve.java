
//program to demonstrate how checked exceptions prompted between method calls.

package com.hcl.exceptions;

class FooBar {

	public void m1() {
		System.out.println("i am m1()");
		try {

		} finally {
			System.out.println("i am finally in m1()");
		}
	}

	public void m2() {
		System.out.println("i am m2()");
		try {
			throw new ArithmeticException("/ by zero");
		} catch (ArithmeticException e) {
			System.out.println("catch in m2 " + e.getMessage());
		} finally {
			System.out.println("i am finally in m2()");
		}

	}

	public void m3() {

		try {
			System.out.println("i am m3()");
			return;

		} catch (IllegalStateException i) {
			System.out.println("catch in m3 " + i.getMessage());
		} finally {
			System.out.println("i am finally in m3()");
		}

	}

}

public class AppTwelve {

	public static void main(String[] args) {

		FooBar obj = new FooBar();

		obj.m1();

		obj.m2();

		obj.m3();

	}

}
