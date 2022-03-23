package com.hcl.TreeSet;

//program to develop TreeSet operations

import java.util.TreeSet;

public class AppThree {

	public static void main(String[] args) {

		TreeSet<String> nameSet = new TreeSet<>();

		nameSet.add("ABC");
		nameSet.add("Kiran");
		nameSet.add("Surya");
		nameSet.add("Kumar");
		nameSet.add("Ashok");
		nameSet.add("Bindu");
		nameSet.add("Rathna");
		nameSet.add("Sahas");
		nameSet.add("ABC");

		System.out.println(nameSet);

		// findout whose third letter is R (or) r.

		for (String name : nameSet) {

			if (name.indexOf('R') == 2 || name.indexOf('r') == 2) {
				System.out.println(name);
			}

		}

	}
}