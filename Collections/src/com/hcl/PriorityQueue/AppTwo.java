package com.hcl.PriorityQueue;

import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class AppTwo {

	public static void main(String[] args) {

		SortedSet<String> set = new TreeSet<>();

		set.add("Def");
		set.add("Abc");
		set.add("Cdd");
		set.add("Bbbbcc");

		System.out.println(set);

		PriorityQueue<String> queue = new PriorityQueue<String>(set);

		System.out.println(queue);
		queue.offer("GHI");
		queue.offer("EFC");
		queue.offer("MNO");
		System.out.println(queue);

	}

}
