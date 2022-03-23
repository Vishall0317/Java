package com.hcl.ArrayList;


//program to demonstrate other operations on ArrayList collection

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AppSeven {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> numList = new ArrayList<Integer>();
		int age;
		System.out.println("Enter ages of 6 people:");
		for (int i = 1; i <= 6; i++) {
			age = scanner.nextInt();
			numList.add(age);
		}

		Integer maxAge = Collections.max(numList);
		System.out.println("Older person age:" + maxAge);

		Integer minAge = Collections.min(numList);
		System.out.println("Younger person age:" + minAge);
		scanner.close();

	}

}