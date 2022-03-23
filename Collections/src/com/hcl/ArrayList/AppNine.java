package com.hcl.ArrayList;

//program to demonstrate other operations on LinkedList collection

import java.util.LinkedList;
import java.util.ListIterator;

public class AppNine {

	public static void main(String[] args) {

		LinkedList<Integer> numList = new LinkedList<Integer>();

		numList.add(100);
		numList.add(20);
		numList.add(40);
		numList.add(300);
		numList.add(60);
		numList.add(300);

		System.out.println(numList);
		numList.addFirst(1000);
		System.out.println(numList);
		numList.addLast(3000);
		System.out.println(numList);
		numList.add(2, 4000);
		System.out.println(numList);
		
		System.out.println("first element in list: "+numList.getFirst());
		System.out.println("last elemement in list: "+numList.getLast());
		}
}