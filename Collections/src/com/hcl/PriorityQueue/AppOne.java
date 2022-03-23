package com.hcl.PriorityQueue;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class NamedComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}
public class AppOne{

	public static void main(String[] args) {

//		PriorityQueue<String> queue = new PriorityQueue<String>(3,new NamedComparator());
		PriorityQueue<String> queue = new PriorityQueue<String>(3);
		
		System.out.println("queue size is: " + queue.size());
		queue.add("DEF");
		queue.add("ABC");
		queue.add("CDD");
		queue.add("BBC");

		System.out.println(queue);

		Iterator<String> iterator = queue.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("queue size is: " + queue.size());

		Object[] array = queue.toArray();
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
			
	}

}
