
//program to test that Thread class is implementing run() method or not.

package com.hcl.multithreading;

class TestThread extends Thread {

	@Override
	public void run() {
		System.out.println("i am invoked");
	}
}

public class AppSix {

	public static void main(String[] args) {

		System.out.println("program starts");

		TestThread t1 = new TestThread();
		t1.start();

		System.out.println("program ends");

	}

}
