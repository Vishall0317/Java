package com.hcl.generics1;

//program to demonstrate generic class and method handles array of elements

class GenericArrayHandler<T> {

	T obj;
	T[] nums;

	public GenericArrayHandler(T obj, T[] nums) {

		this.obj = obj;
		this.nums = nums;

	}

	public void printNums() {

		System.out.println("No.of elements:" + obj);
		for (T num : nums) {
			System.out.println("Element is: " + num);

		}

	}

}

public class AppFour {

	public static void main(String[] args) {
		
		Integer[] array= {100,200,300,400};
		
		GenericArrayHandler<Integer>  gah1=new GenericArrayHandler<Integer>(array.length,array);
		
		gah1.printNums();
		
		
		String[] names= {"Arun","Kiran","Kumar","Sam","Santhosh"};
		
		GenericArrayHandler<String>  gah2=new GenericArrayHandler<String>(""+names.length,names);
		
		gah2.printNums();
		
	}
}