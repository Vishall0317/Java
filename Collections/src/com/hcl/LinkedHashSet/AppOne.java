package com.hcl.LinkedHashSet;


//program to develop LinkedHashSet operations


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AppOne {

	public static void main(String[] args) {

		Set<Integer> numSet=new LinkedHashSet<>(10);

		System.out.println("numSet size: " + numSet.size());
		numSet.add(10);
		System.out.println("numSet.add(20) is: " + numSet.add(20));
		numSet.add(30);
		numSet.add(40);
		numSet.add(50);
		System.out.println("numSet.add(20) is: " + numSet.add(20));
		numSet.add(null);
		numSet.add(null);
		numSet.add(new Integer(20));

		System.out.println("numSet size: " + numSet.size());
		System.out.println(numSet);

		System.out.println("is numSet empty: " + numSet.isEmpty());

		if (numSet.contains(20)) {
			System.out.println("20 is present in set");
		} else {
			System.out.println("20 is not present in set");
		}
		
		
		Set<Integer> numSet2=new HashSet<>();
		numSet2.add(1000);
		numSet2.add(3000);
		numSet2.add(4000);
		
		numSet.addAll(numSet2);
		
		System.out.println(numSet);
		
		System.out.println("numSet removed element is:"+numSet.remove(3000));
		
		System.out.println("numSet removed element is:"+numSet.remove(6000));
		
		
		Iterator<Integer> iterator = numSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("------for each------------");
		
		System.out.println("numSet removed numSet2 is:"+numSet.removeAll(numSet2));
		
		for(Integer i:numSet) {
			System.out.println("Num is: "+i);
		}
		numSet.clear();
		
		System.out.println(numSet);
				
	}
}