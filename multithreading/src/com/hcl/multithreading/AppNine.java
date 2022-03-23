
//program to demonstrates that threads are executed independently.

package com.hcl.multithreading;

class HelloThread extends Thread {

	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(this.currentThread()+" printing is: " + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class AppNine {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread()+" starts.");
		HelloThread t = new HelloThread();
		t.start();
		t.join();
		t.join(1200);
		System.out.println(Thread.currentThread()+" ends.");
	}
}