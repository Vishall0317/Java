//program to create a HashMap and store user-defined objects.

package com.hcl.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Student {

	private int id;
	private String name;
	private String email;

	public Student() {
	}

	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

class Course {

	private String code;
	private String name;
	private double fee;

	public Course(String id, String name, double fee) {
		super();
		this.code = id;
		this.name = name;
		this.fee = fee;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String id) {
		this.code = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}

public class AppFive {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		HashMap<Student, Course> stCourseMap = new HashMap<Student, Course>();

		Student s1 = new Student(1001, "Arun", "arun@yahoo.com");
		Student s2 = new Student(1002, "Varun", "varun@yahoo.com");
		Student s3 = new Student(1003, "Tarun", "tarun@yahoo.com");
		Student s4 = new Student(1004, "Karun", "karun@yahoo.com");

		Course c1 = new Course("JA1200", "Java FSD", 40000.25);

		Course c2 = new Course("WEB1340", "WEB Stack", 35000.25);

		stCourseMap.put(s1, c1);
		stCourseMap.put(s2, c1);
		stCourseMap.put(s3, c1);
		stCourseMap.put(s4, c2);

		System.out.println("enter student id: ");

		int sId = scanner.nextInt();

		findCourseOfStudent(stCourseMap, sId);

		System.out.println("enter course code:");

		String cCode = scanner.next();

		findStudentsJoinedCourse(stCourseMap, cCode);

	}

	private static void findStudentsJoinedCourse(HashMap<Student, Course> stCourseMap, String cCode) {

		// logic to find the students who joined a course

		Set<Entry<Student, Course>> entrySet = stCourseMap.entrySet();

		for (Entry<Student, Course> entry : entrySet) {

			Student key = entry.getKey();

			Course course = entry.getValue();

			if (course.getCode().equals(cCode)) {
				System.out.println(key.getId() + "  " + key.getName());

			}

		}
	}
	
	

	private static void findCourseOfStudent(HashMap<Student, Course> stCourseMap, int sId) {

		Set<Student> students = stCourseMap.keySet();

		for (Student student : students) {

			if (student.getId() == sId) {
				Course course = stCourseMap.get(student);
				System.out.println(course.getCode() + " " + course.getName() + course.getFee());
				return;
			}

		}

		System.out.println("No course found for the student id:" + sId);

	}
}