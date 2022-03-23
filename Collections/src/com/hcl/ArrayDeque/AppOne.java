package com.hcl.ArrayDeque;


import java.util.ArrayDeque;
import java.util.Deque;

public class AppOne {

	public static void main(String[] args) {

		Deque<String> queue = new ArrayDeque<String>();

		System.out.println("queue size is: " + queue.size());
		queue.add("Hyd");
		queue.add("Sec");
		queue.add("Lucknow");
		queue.add("Pune");

		System.out.println(queue);
		System.out.println("queue size is: " + queue.size());
		queue.add("Bubaneshwar");
		queue.offer("Koramangal");

		System.out.println("peek element is: " + queue.peek());
		System.out.println(queue);

		queue.remove();
		queue.remove();

		System.out.println(queue);

		queue.remove();
		queue.remove();
		queue.remove();
		System.out.println(queue);

		System.out.println("removing element from queue:" + queue.poll());
		System.out.println(queue);
		System.out.println("removing element from queue:" + queue.poll());

	}

}
