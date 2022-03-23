
//program to demonstrate obtaining Synchronized collection

package com.hcl.multithreading.advance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SListHandler extends Thread {

	private static List<Integer> numList = Collections
			.synchronizedList(Arrays.asList(new Integer[] { 100, 200, 300, 400, 500 }));

	public static int sum = 0;

	public synchronized void findSum() {

		for (int i = 0; i < numList.size(); i++) {
			sum = sum + numList.get(i);
		}

	}

	public void run() {
		findSum();
	}
}

public class AppEight {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("sum is: " + SListHandler.sum);

		SListHandler thread = new SListHandler();
		thread.start();

		SListHandler thread2 = new SListHandler();
		thread2.start();

		SListHandler thread3 = new SListHandler();
		thread3.start();

		thread.join();
		thread2.join();
		thread3.join();

		System.out.println("sum is: " + SListHandler.sum);

	}

}
