
//program to demonstrate creation of multiple threads and their execution flow

package com.hcl.multithreading;

class MyThread1 extends Thread {

	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(this.currentThread() + " printing: " + i);
				Thread.sleep(700);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class AppThree {

	public static void main(String[] args) {

		MyThread1 obj = new MyThread1();
		obj.setName("MyThread-1");
		obj.setPriority(2);
		obj.start();

		MyThread1 obj2 = new MyThread1();
		obj2.setName("MyThread-2");
		obj2.setPriority(8);
		obj2.start();

		MyThread1 obj3 = new MyThread1();
		obj3.setName("MyThread-3");
		obj3.setPriority(10);
		obj3.start();

	}

}