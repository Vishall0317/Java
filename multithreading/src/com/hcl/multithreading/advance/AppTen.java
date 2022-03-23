
//program to demonstrate obtaining Synchronized collection with safe iterator

package com.hcl.multithreading.advance;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

class SafeHandler extends Thread {

	//private static List<Integer> numSet = Collections
	//		.synchronizedList(Arrays.asList(new Integer[] { 100, 200, 300, 400, 500 }));
	
	private static CopyOnWriteArraySet<Integer> numSet = new CopyOnWriteArraySet<Integer>(
			Arrays.asList(new Integer[] { 100, 200, 300, 400, 500 }));

	public static int sum = 0;

	public void run() {

		
		Iterator<Integer> iterator = numSet.iterator();
		
		while(iterator.hasNext()) {
			sum=sum+iterator.next();
		}
		
		
	}

}

public class AppTen {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("sum is: " + SafeHandler.sum);

		SafeHandler thread = new SafeHandler();
		thread.start();

		SafeHandler thread2 = new SafeHandler();
		thread2.start();

		thread.join();
		thread2.join();

		System.out.println("sum is: " + SafeHandler.sum);

	}

}
