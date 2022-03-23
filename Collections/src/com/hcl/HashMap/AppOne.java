//program to create a HashMap and store,read values.

package com.hcl.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class AppOne {

	public static void main(String[] args) {

		HashMap<Float, String> namesMap = new HashMap<>();

		namesMap.put((float) 1002, "Kumar");
		namesMap.put((float) 1003, "Prakash");
		namesMap.put((float) 1001, "Arun");
		namesMap.put((float) 1004, "Arvind");
		namesMap.put((float) 1005, "Vishal");
		namesMap.put((float) 1010, "Kiran");

		System.out.println(namesMap);

		Set<Entry<Float, String>> entrySet = namesMap.entrySet();

		for (Entry<Float, String> entry : entrySet) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

}
