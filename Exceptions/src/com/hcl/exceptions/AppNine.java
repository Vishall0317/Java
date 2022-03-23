package com.hcl.exceptions;


//program to demonstrate re-throwing an exception object using throw clause


import java.util.Arrays;
import java.util.List;

class Flipkart {

	private static List<String> products = Arrays.asList(new String[] { "Fan", "Mobile", "Tv", "Chair" });

	public void bookProduct(String name) {
		try {

			if (products.contains(name)) {
				System.out.println("product booked");
			} else {
				// creation of exception object and throws it
				throw new IllegalStateException("Product is not found"); 
			}

		} catch (IllegalStateException exception) {
			System.out.println("Exception :" + exception.getMessage());
			throw exception;  //re-throwing the exception
		}

	}
}

class Customer {

	private int id;
	private String name;

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void buyProduct(String name) {
		
		try {
		Flipkart flipkart = new Flipkart();
		flipkart.bookProduct(name);
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}

public class AppNine {

	public static void main(String[] args) {

		Customer c1=new Customer(1001,"Arun Kumar");
		c1.buyProduct("lappy");
		System.out.println("program ends");
		
	}
}
