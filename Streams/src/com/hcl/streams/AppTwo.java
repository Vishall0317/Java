
//program to demonstrate creation of streams on Collection

package com.hcl.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AppTwo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList(
				new String[] { "Ashok", "Arvind", "Suhash", "Mohan", "Ashok", "Raj", "Sneha", "Sindhu", "Raj" });

		long count = names.stream().filter(name -> name.startsWith("S")).count();

		System.out.println("Names start with letter \'S\' are: " + count);

		List<String> namesStartWithS = names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());

		System.out.println(namesStartWithS);

		Collections.sort(namesStartWithS);

		System.out.println("after sort:" + namesStartWithS);

		List<Integer> longStream = names.stream().filter(n -> n.startsWith("S")).map(n -> n.length())
				.collect(Collectors.toList());

		System.out.println(longStream);
		
		
		 List<String> distinctElements = names.stream().distinct().collect(Collectors.toList());
		 
		 System.out.println(distinctElements);
		
		distinctElements.forEach(e->System.out.println("Element is: "+e));
		
		distinctElements.forEach(System.out::println);

	}
}