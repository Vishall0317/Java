
//program to demonstrate obtaining non-Synchronized collection

package com.hcl.multithreading.advance;

import java.util.Arrays;
import java.util.List;

class ListHandler extends Thread {

	private static List<Integer> numList = Arrays.asList(new Integer[] { 100, 200, 300, 400, 500 });

	public static int sum = 0;

	public void run() {

		for (int i = 0; i < numList.size(); i++) {
			sum = sum + numList.get(i);
		}
	}

}

public class AppSeven {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("sum is: " + ListHandler.sum);

		ListHandler thread = new ListHandler();
		thread.start();
		
		ListHandler thread2 = new ListHandler();
		thread2.start();
		
		ListHandler thread3 = new ListHandler();
		thread3.start();
		
		thread.join();
		thread2.join();
		thread3.join();
		
		System.out.println("sum is: " + ListHandler.sum);
//		List<Integer> synchronizedList = Collections.synchronizedList(numList);

	}

}
