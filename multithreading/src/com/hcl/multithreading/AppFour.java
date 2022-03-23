
//program to demonstrate creation of multiple threads and their execution flow

package com.hcl.multithreading;

class DemoThread1 extends Thread {

	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(this.currentThread() + " printing:" + i);
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class DemoThread2 extends Thread {
	public void run() {

		try {
			for (int i = 10; i >= 5; i--) {
				System.out.println(this.currentThread() + " printing:" + i);
				Thread.sleep(700);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class AppFour {

	public static void main(String[] args) {

		DemoThread1 obj = new DemoThread1();
		obj.setName("Demo-1");
		obj.setPriority(2);
		obj.start();
		
		DemoThread2 obj2 = new DemoThread2();
		obj2.setName("Demo-2");
		obj2.setPriority(8);
		obj2.start();

	}

}