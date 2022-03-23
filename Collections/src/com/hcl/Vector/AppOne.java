package com.hcl.Vector;

import java.util.Vector;

public class AppOne {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();
		char ch = 'D';
		for (int i = 1; i <= 5; i++) {

			vector.add("ABC" + ch);
			ch++;
		}

		System.out.println(vector);

		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}

	}

}
