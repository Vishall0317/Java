package com.hcl.ArrayList;


//program to demonstrate other operations on ArrayList collection

import java.util.LinkedList;
import java.util.ListIterator;

public class AppEight {

	public static void main(String[] args) {

		LinkedList<Integer> numList = new LinkedList<Integer>();

		numList.add(100);
		numList.add(20);
		numList.add(300);
		numList.add(40);
		numList.add(300);
		numList.add(60);
		numList.add(300);

		ListIterator<Integer> listIterator = numList.listIterator();

		System.out.println("------Forward direction--------");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}

		System.out.println("--------Backward direction---------");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}