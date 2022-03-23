
//program to demonstrate storing diff types of elements into a ArrayList collection
package com.hcl.ArrayList;

import java.util.ArrayList;

public class AppOne {

	public static void main(String[] args) {
	
		
		ArrayList  list=new ArrayList();
		System.out.println("No.of elements in list:"+list.size());
		list.add(110);
		list.add(120);
		list.add("Suman");
		list.add(2560.25);
		list.add(false);
		list.add('M');
		
		System.out.println(list);
		
		System.out.println("No.of elements in list:"+list.size());
		
		
		list.add(400);
		list.add(true);
		System.out.println(list);
		System.out.println("No.of elements in list:"+list.size());
		
		
		
		
		
	}

}
