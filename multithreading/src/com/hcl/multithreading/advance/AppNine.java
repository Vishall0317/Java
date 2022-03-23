
//program to demonstrate obtaining Synchronized collection

package com.hcl.multithreading.advance;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

class ListHandlerr extends Thread {

//	 private static Set<Integer> numSet = Collections
//	 .synchronizedSet(new HashSet<Integer>(Arrays.asList(new Integer[] { 100, 200,
//	 300, 400, 500 })));

//	private static CopyOnWriteArraySet<Integer> numSet = new CopyOnWriteArraySet<Integer>(
//			Arrays.asList(new Integer[] { 100, 200, 300, 400, 500 }));

	// private static Set<Integer> numSet = new HashSet<>(Arrays.asList(new
	// Integer[] { 100, 200, 300, 400, 500 }));

	
	private static List<Integer> numSet = Collections
			.synchronizedList(Arrays.asList(new Integer[] { 100, 200, 300, 400, 500 }));
	
	public static int sum = 0;

	public void run() {

		for (Integer i : numSet) {
			sum = sum + i;
		}
	}

}

public class AppNine {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("sum is: " + ListHandlerr.sum);

		ListHandlerr thread = new ListHandlerr();
		thread.start();

		ListHandlerr thread2 = new ListHandlerr();
		thread2.start();

/*		ListHandlerr thread3 = new ListHandlerr();
		thread3.start();
*/
		thread.join();
		thread2.join();
//		thread3.join();

		System.out.println("sum is: " + ListHandlerr.sum);

	}

}
