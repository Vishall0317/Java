
//program to demonstrate making a thread as Daemon

package com.hcl.multithreading.advance;

class MyThread extends Thread {

	@Override
	public void run() {

		try {

			System.out.println("thread is Daemon:" + this.isDaemon());

			char c = 'A';

			for (int i = 1; i <= 10; i++) {

				System.out.println("char is: " + c++);
				Thread.sleep(200);
			}
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		System.out.println("thread is Daemon:" + this.isDaemon());
	}
}

public class AppFour {

	public static void main(String[] args) {

		System.out.println("app started");
		MyThread t = new MyThread();

		// t.setDaemon(true);

		t.start();

	}

}
