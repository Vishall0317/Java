
//program to demonstrate storing numbers into a ArrayList collection

package com.hcl.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AppThree {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>();

		numList.add(100);
		numList.add(new Integer(200));
		numList.add(23);
		numList.add(45);
		numList.add(50);
		numList.add(15);
		numList.add(9);
		
		System.out.println(numList);
		
		
		Iterator<Integer> iterator = numList.iterator();
		
		
		while(iterator.hasNext()) {
			int n=iterator.next();
			if(n%2==0) {
			System.out.println(n);
			}		
			//iterator.remove();
		}
		
		iterator.remove();
		//iterator.remove();
		
			
		System.out.println(numList);
		
		
		
		
	}

}