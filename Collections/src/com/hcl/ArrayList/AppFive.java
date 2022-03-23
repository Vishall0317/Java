package com.hcl.ArrayList;


//program to demonstrate operations on ArrayList collection

import java.util.ArrayList;
import java.util.Iterator;

public class AppFive {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>();

		numList.add(100);
		numList.add(23);
		numList.add(45);
		numList.add(50);
		numList.add(15);
		numList.add(9);

		System.out.println(numList);

		numList.add(2, 400); // insertion at position-2
		System.out.println(numList);

		numList.set(4, 600);// replacing at position-4
		System.out.println(numList);

		System.out.println(numList.remove(1));// removes element at position-1
		System.out.println(numList);

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(2000);
		list2.add(4000);
		list2.add(6000);

		numList.addAll(list2); // adding list2 into numList

		System.out.println(numList);

		numList.addAll(0, list2);// adding list2 into numList at position-0

		System.out.println(numList);

		System.out.println("List-2 is:" + list2);
		list2.clear();
		System.out.println("List-2 is:" + list2);

		System.out.println("use of get method");
		
		for(int i=0;i<numList.size();i++) {
			System.out.println("element is: "+numList.get(i));
		}
		

		System.out.println("50 is present in numList: "+numList.contains(50));

		System.out.println("15 is present in numList: "+numList.contains(15));
	}

}