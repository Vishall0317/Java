package com.hcl.CustomException;


//program to create custom exception for raising whenever the bank account initial amount is <500

import java.util.Random;

class CreditCard {

	private int acntNo;
	private String holderName;
	private double creditLimit;

	public CreditCard(String name) {
		acntNo = generateAccountNo();
		holderName = name;
		creditLimit = 85000;
	}

	private int generateAccountNo() {
		Random random = new Random();
		return Math.abs(random.nextInt());
	}

	@Override
	public String toString() {
		return "CreditCard [acntNo=" + acntNo + ", holderName=" + holderName + ", creditLimit=" + creditLimit + "]";
	}

}

class Employ {

	private int id;
	private String name;
	private double salary;

	public Employ(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public CreditCard applyForCard(Employ e) {
		CardAgent agent = new CardAgent();
		return agent.verifyApplication(e);

	}
}

class CardAgent {

	private static int id = 1001;
	private static String name = "Harry";

	public void displayAgentInfo() {
		System.out.println("Agent details: " + id + " " + name);
	}

	public CreditCard verifyApplication(Employ employ) {

		if (employ.getId() < 0) {
			throw new InvalidApplicationException("Employ id is not valid, so card is not issued");
		} else if (employ.getName().isEmpty() || employ.getName() == null) {
			throw new InvalidApplicationException("Employ name is not valid, so card isn't issued");

		} else if (employ.getSalary() < 25000) {
			throw new InvalidApplicationException(employ.getSalary()+" is not sufficient to issue card");
		}
		
		return generateCard(employ.getName());

	}

	public CreditCard generateCard(String name) {
		CreditCard card = new CreditCard(name);
		return card;
	}
}

class InvalidApplicationException extends RuntimeException {

	public InvalidApplicationException(String msg) {
		super(msg);
	}

}

public class CustomException3 {

	public static void main(String[] args) {

		try {

			Employ e1 = new Employ(1001, "ravi", 45000.25);
			CreditCard card = e1.applyForCard(e1);

			System.out.println(card);

			Employ e2 = new Employ(1002, "arun", 15000.25);
			CreditCard card2 = e2.applyForCard(e2);

			System.out.println(card2);
		} catch (InvalidApplicationException exception) {
			System.out.println(exception.getLocalizedMessage());
		}
		System.out.println("program ends");
	}

}