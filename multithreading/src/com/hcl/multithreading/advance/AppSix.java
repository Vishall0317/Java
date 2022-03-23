
//program to demonstrate the use of CopyOnWriteArraySet concurrent collection

package com.hcl.multithreading.advance;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class AppSix {

	public static void main(String[] args) {

		CopyOnWriteArraySet<Integer> numSet = new CopyOnWriteArraySet<>();
//		ArrayList<Integer> numSet = new ArrayList<>();

		//HashSet<Integer> numSet=new HashSet<>();
		
		numSet.add(100);
		numSet.add(200);
		numSet.add(100);
		numSet.add(300);
		numSet.add(400);
		System.out.println("numSet is: " + numSet);
		Iterator<Integer> iterator = numSet.iterator();

		while (iterator.hasNext()) {
			System.out.println("Element is: " + iterator.next());
			numSet.add(2000);// add element to set
		}
		System.out.println("numSet is: " + numSet);
	}

}
