
//program to demonstrate how un-checked exceptions prompted between method calls.

package com.hcl.exceptions;

class HelloExceptions {

	public void m1() {
		System.out.println("HelloExceptions.m1()");
		m2();
	}

	public void m2() {
		System.out.println("HelloExceptions.m2()");
		m3();
	}

	public void m3() {
		System.out.println("HelloExceptions.m3()");
		throw new ArithmeticException("un-checked exception");
	}

}

public class AppTen {

	public static void main(String[] args) {
		
		try {
		HelloExceptions obj=new HelloExceptions();
		
		obj.m1();
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
