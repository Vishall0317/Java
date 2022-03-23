package com.hcl.TreeSet;

//program to develop TreeSet operations

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class AppTwo {

	public static void main(String[] args) {

		TreeSet<Integer> numSet = new TreeSet<>();

		System.out.println("numSet size: " + numSet.size());
		// numSet.add(null); null value can't be stored in a TreeSet
		numSet.add(10);
		numSet.add(80);
		numSet.add(20);
		numSet.add(65);
		numSet.add(50);
		numSet.add(70);

		System.out.println("numSet size: " + numSet.size());
		System.out.println(numSet);

		System.out.println("headSet is:" + numSet.headSet(65));
		System.out.println("headSet is:" + numSet.headSet(65, true));
		System.out.println("subSet is: " + numSet.subSet(40, 71));
		// System.out.println(numSet.subSet(50, false, 80,false));
		System.out.println("tailSet is: " + numSet.tailSet(65));
		System.out.println("tailSet is: " + numSet.tailSet(65, false));

		Iterator<Integer> iterator = numSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		Iterator<Integer> descendingIterator = numSet.descendingIterator();
		System.out.println("-------descending order----------");

		while (descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}

		NavigableSet<Integer> navigableSet = numSet.descendingSet();

		System.out.println(navigableSet);

	}
}