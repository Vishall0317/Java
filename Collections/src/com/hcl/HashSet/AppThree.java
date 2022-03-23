package com.hcl.HashSet;

//program to develop HashSet sort operation


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppThree {

	public static void main(String[] args) {

		Set<Integer> numSet = new HashSet<>(10);

		numSet.add(10);
		numSet.add(30);
		numSet.add(40);
		numSet.add(50);
		numSet.add(null);
		numSet.add(20);

		System.out.println(numSet);

		List<Integer> numList = new ArrayList<Integer>(numSet);

		numList.remove(null);
		Collections.sort(numList);

		System.out.println(numList);

		numSet.remove(null);
		Object[] numArray = numSet.toArray();
				
		Arrays.sort(numArray);
		
		System.out.println(Arrays.toString(numArray));
	
	}
}