//program to store user-defined objects into a HashSet and stopping duplicate objects insertion
package com.hcl.HashSet;

import java.util.HashSet;

class Student {
	private int id;
	private String name;
	private String branch;

	public Student(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	public void studentInfo() {
		System.out.println(id + "  " + name + "  " + branch);
	}

	@Override
	public int hashCode() {

		return id * (name.hashCode()) * (branch.hashCode()) / 20;
	}

	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == ((Student) obj).hashCode();
	}

}

public class AppOne{

	public static void main(String[] args) {

		Student s1 = new Student(100, "Arun", "CSE");
		Student s2 = new Student(101, "Vishal", "CSE");
		Student s3 = new Student(102, "Sohail", "CSE");
		Student s4 = new Student(103, "Varun", "CSE");
		Student s5 = new Student(104, "Mohan", "CSE");
		Student s6 = new Student(100, "Arun", "CSE");

		HashSet<Student> studentSet = new HashSet<Student>();

		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		studentSet.add(s4);
		studentSet.add(s5);
		studentSet.add(s6);

		for (Student s : studentSet) {
			s.studentInfo();
		}
	}
}