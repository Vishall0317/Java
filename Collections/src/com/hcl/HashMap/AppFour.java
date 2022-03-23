//program to create a HashMap and read keys and values

package com.hcl.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class AppFour {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		HashMap<Integer, String> namesMap = new HashMap<Integer, String>();

		namesMap.put(1002, "Kumar");
		namesMap.put(1003, "Prakash");
		namesMap.put(1001, "Arun");
		namesMap.put(1004, "Arvind");
		namesMap.put(1005, "Vishal");
		namesMap.put(1010, "Kiran");
		System.out.println(namesMap);
		System.out.println("keys are: " + namesMap.keySet());

		System.out.println("values : " + namesMap.values());

		System.out.println("removing 1003 value " + namesMap.remove(1003));
		System.out.println("removing 1001 value " + namesMap.remove(1001));

		System.out.println("replacing 1010 value " + namesMap.replace(1010, "Kiran", "KSKK"));
		System.out.println(namesMap);
		namesMap.clear();
		System.out.println(namesMap);

	}

}
