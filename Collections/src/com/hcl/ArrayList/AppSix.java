package com.hcl.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AppSix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> numList = new ArrayList<Integer>();
		int age;
		System.out.println("Enter ages of 6 people:");
		for (int i = 1; i <= 6; i++) {
			age = scanner.nextInt();
			numList.add(age);
		}

		System.out.println(numList);

		System.out.println("Ages in Ascending order:");
		/*
		 * Object[] tArry=numList.toArray(); Arrays.sort(tArry);
		 * System.out.println(Arrays.toString(tArry));
		 */

		Collections.sort(numList);

		System.out.println(numList);

		scanner.close();

	}

}