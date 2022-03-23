
//program to demonstrate deadlock and resolve the deadlock

package com.hcl.multithreading.advance;

public class AppThree {
	public static void main(String[] args) {
		
		final String resource1 = "Chockelet";
		
		final String resource2 = "Biscuit";
		
		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked "+resource1);

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (resource2) {
						System.out.println("Thread 1: locked "+resource2);
					}
				}
			}
		};

		// t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 2: locked "+resource1);

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (resource2) {
						System.out.println("Thread 2: locked "+resource2);
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}