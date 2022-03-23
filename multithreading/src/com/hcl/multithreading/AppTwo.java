
//program to demonstrate creation of thread by extending from Thread class

package com.hcl.multithreading;

class MyThread extends Thread {

	public void run() { // running

		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Number is: " + i);
				Thread.sleep(500); // blocked state
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class AppTwo {

	public static void main(String[] args) {

		MyThread obj = new MyThread(); // newstate

		obj.start(); // runnable

	}

}