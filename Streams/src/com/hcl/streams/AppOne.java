
//program to demonstrate creation of streams on an Array

package com.hcl.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppOne {

	public static void main(String[] args) {

		Integer nums[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		Stream<Integer> stream = Arrays.stream(nums);

		List<Integer> evenNums = stream.filter(e -> e % 2 == 0).collect(Collectors.toList());

		System.out.println(evenNums);
		
		Integer newEvenNums[]=new Integer[evenNums.size()];
		
		evenNums.toArray(newEvenNums);
		
		//Set<Integer> numSet = stream.map(x -> x * 2).collect(Collectors.toSet());
		
		List<Integer> numSet = Arrays.stream(newEvenNums).map(x->x*2).collect(Collectors.toList());

		System.out.println(numSet);
	}
}