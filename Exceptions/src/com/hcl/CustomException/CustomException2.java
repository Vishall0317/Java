package com.hcl.CustomException;


//program to create custom exception for raising whenever the bank account initial amount is <500

import java.util.Random;

class InsufficientAmountException extends RuntimeException {

	public InsufficientAmountException(String msg) {
		super(msg);
	}

}

class BankAccount {

	private int acntNo;
	private String holderName;
	private double balance;

	private int generateAccountNo() {
		Random random = new Random();
		return Math.abs(random.nextInt());
	}

	public void openAccount(String holder, double amount) {

		acntNo = generateAccountNo();
		holderName = holder;

		if (amount < 500) {
			throw new InsufficientAmountException(amount + " is not sufficient to open account");
		}
		balance = amount;
	}

	@Override
	public String toString() {
		return "BankAccount [acntNo=" + acntNo + ", holderName=" + holderName + ", balance=" + balance + "]";
	}

}

public class CustomException2 {

	public static void main(String[] args) {

		try {
		BankAccount acnt1 = new BankAccount();
		acnt1.openAccount("Suman", 400.25);

		System.out.println(acnt1);
		}catch(InsufficientAmountException exception) {
			System.out.println(exception.getMessage());
			
			StackTraceElement[] stackTrace = exception.getStackTrace();
			
			for(StackTraceElement ele:stackTrace) {
				System.out.println(ele);
			}
			
		}
		System.out.println("program ends.");
		
	}

}
