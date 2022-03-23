package com.hcl.LinkedList;

import java.util.LinkedList;

public class AppOne {

	public static void main(String[] args) {

		LinkedList<String> list= new LinkedList<String>();

		System.out.println("list size is: " + list.size());
		list.add("Hyd");
		list.add("Sec");
		list.add("Lucknow");
		list.add("Pune");

		System.out.println(list);
		System.out.println("list size is: " + list.size());
		list.add("Bubaneshwar");
		list.offer("Koramangal");

		System.out.println("peek element is: " + list.peek());
		System.out.println(list);

		list.remove();
		list.remove();

		System.out.println(list);

		list.remove();
		list.remove();
		list.remove();
		System.out.println(list);

		System.out.println("removing element from queue:" + list.poll());
		System.out.println(list);
		System.out.println("removing element from queue:" + list.poll());

	}

}
