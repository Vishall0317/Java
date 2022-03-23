
//program to demonstrate the need for concurrent collections and CopyOnWriteArrayList.

package com.hcl.multithreading.advance;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class AppFive {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer>  numList=new CopyOnWriteArrayList<>();
//		ArrayList<Integer> numList = new ArrayList<>();
		
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		System.out.println("numList is: " + numList);
		Iterator<Integer> iterator = numList.iterator();

		while (iterator.hasNext()) {
			System.out.println("Element is: " + iterator.next());
			numList.set(1, 2000);//replace element in 1-st position
		}

//		numList.set(1, 2000);//replace operation
		System.out.println("numList is: " + numList);
	}

}
