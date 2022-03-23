package com.hcl.generics1;
//program to demonstrate generic class and object creation


class AllTypeCollection<T> {

	T obj;

	AllTypeCollection(T obj) {
		this.obj = obj;
	}

	T getObject() {
		return this.obj;
	}

	public void showType() {
		System.out.println("Type of given object is: " + obj.getClass().getName());
	}
}

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id+" "+name;
	}
}

public class AppOne {

	public static void main(String[] args) {

		AllTypeCollection<Integer> atc = new AllTypeCollection<Integer>(20);

		atc.showType();
		Integer val1 = atc.getObject();
		System.out.println("value is: "+val1);

		AllTypeCollection<String> atc2 = new AllTypeCollection<String>("Welcome");

		atc2.showType();
		String val2 = atc2.getObject();
		System.out.println("value is: "+val2);


		AllTypeCollection<Boolean> atc3 = new AllTypeCollection<Boolean>(false);
		atc3.showType();
		Boolean val3 = atc3.getObject();
		System.out.println("value is: "+val3);
		
		AllTypeCollection<Student> atc4 = new AllTypeCollection<Student>(new Student(1001,"Raaja"));
		atc4.showType();
		
		Student val4 = atc4.getObject();
		
		System.out.println("value is: "+val4);
	}
}