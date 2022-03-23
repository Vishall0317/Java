
//program to demonstrate how checked exceptions prompted between method calls.

package com.hcl.exceptions;

import java.io.IOException;
import java.sql.SQLException;

class HelloException {

	public void m1() throws IOException, SQLException {
		System.out.println("HelloExceptions.m1()");
		m2();
	}

	public void m2() throws IOException, SQLException {
		System.out.println("HelloExceptions.m2()");
		m3();
	}

	public void m3() throws IOException, SQLException {
		System.out.println("HelloExceptions.m3()");
		if (1 == 1) {
			throw new IOException("un-checked exception"); // IOException is a checked exception
		} else {
			throw new SQLException("data not found");
		}
	}

}

public class AppEleven {

	public static void main(String[] args) {

		try {
			HelloException obj = new HelloException();

			obj.m1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
