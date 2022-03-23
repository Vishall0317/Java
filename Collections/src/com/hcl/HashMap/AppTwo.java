
//program to create a HashMap and store,read values.

package com.hcl.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class AppTwo {

	public static void main(String[] args) {

		HashMap<Integer, String> namesMap = new HashMap<Integer, String>();

		namesMap.put(1002, "Kumar");
		namesMap.put(1003, "Prakash");
		namesMap.put(1001, "Arun");
		namesMap.put(1004, "Arvind");
		namesMap.put(1005, "Vishal");
		namesMap.put(1010, "Kiran");

		System.out.println(namesMap);

		Set<Integer> keySet = namesMap.keySet();

		for (Integer key : keySet) {

			System.out.println(key + " ---> " + namesMap.get(key));
		}

	}

}
