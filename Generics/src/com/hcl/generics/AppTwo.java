//program to demonstrate the need of Generics in Collections F/W
package com.hcl.generics;

import java.util.ArrayList;

public class AppTwo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("ABC");
		list.add("ABC");

		String object1 = (String)list.get(0);
		String object2 = (String)list.get(1);

		System.out.println(object1.length()+"  "+object2.length());
		
		
		ArrayList list2=new ArrayList();
		
		list2.add(120);
		list2.add(100);
		
		Integer obj1 =(Integer) list2.get(0);
		
		Integer obj2 =(Integer) list2.get(1);
		
		System.out.println(obj1+obj2);
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		
		list3.add(100);
		list3.add(200);
		
		System.out.println("sum of 100,200 is: "+(list3.get(0)+list3.get(1)));
		
		
		
		

	}
}
