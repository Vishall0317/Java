
//program to create a HashMap and store,read values.

package com.hcl.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class AppThree {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		HashMap<Integer, String> namesMap = new HashMap<Integer, String>();

		namesMap.put(1002, "Kumar");
		namesMap.put(1003, "Prakash");
		namesMap.put(1001, "Arun");
		namesMap.put(1004, "Arvind");
		namesMap.put(1005, "Vishal");
		namesMap.put(1010, "Kiran");

		Set<Integer> keySet = namesMap.keySet();

		for (Integer key : keySet) {

			System.out.println(key + " ---> " + namesMap.get(key));
		}

		System.out.println("enter student name to search:");
		String searchingName = scanner.next();

		Collection<String> names = namesMap.values();

		for (String name : names) {
			if (name.equals(searchingName)) {

				System.out.println("name found");
				return;
			}
		}
		
		System.out.println("name not found");

		
		
	}

}
