
//program to demonstrate creation of thread by implementing Runnable interface

package com.hcl.multithreading;

class SThread implements Runnable {

	@Override
	public void run() {
		try {
			char c = 'A';
			for (int i = 1; i <= 10; i++) {
				System.out.println(c++);
				Thread.sleep(400);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class AppSeven {

	public static void main(String[] args) {

		SThread obj = new SThread();

		Thread t = new Thread(obj);
		t.start();

		Thread t2 = new Thread(obj);
		t2.start();

	}

}