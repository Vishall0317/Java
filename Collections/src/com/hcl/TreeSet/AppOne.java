//program to store user-defined objects into a TreeSet and sort them
package com.hcl.TreeSet;


import java.util.Comparator;
import java.util.TreeSet;

class Pupil implements Comparable {

	private int id;
	private String name;
	private String branch;

	public Pupil(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}

	public void pupilInfo() {
		System.out.println(id + "  " + name + "  " + branch);
	}

	@Override
	public int hashCode() {

		return id * (name.hashCode()) * (branch.hashCode()) / 20;
	}

	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == ((Pupil) obj).hashCode();
	}

	@Override
	public int compareTo(Object obj) {
		Pupil p1 = this;
		Pupil p2 = (Pupil) obj;

		if (p1.id > p2.id)
			return 1;

		else if (p1.id < p2.id)
			return -1;

		else
			return 0;
	}

}

class PupilNamedOrdering implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Pupil p1 = (Pupil) o1;
		Pupil p2 = (Pupil) o2;

		return p1.getName().compareTo(p2.getName());
	}

}

class PupilBranchOrdering implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Pupil p1 = (Pupil) o1;
		Pupil p2 = (Pupil) o2;

		return p1.getBranch().compareTo(p2.getBranch());
	}

}

public class AppOne {

	public static void main(String[] args) {

		Pupil s1 = new Pupil(100, "Arun", "CSE");
		Pupil s2 = new Pupil(101, "Vishal", "IT");
		Pupil s3 = new Pupil(103, "Sohail", "EEE");
		Pupil s4 = new Pupil(102, "Varun", "IT");
		Pupil s5 = new Pupil(104, "Mohan", "ECE");
		Pupil s6 = new Pupil(100, "Arun", "BCA");

		PupilNamedOrdering namedOrdering = new PupilNamedOrdering();
		PupilBranchOrdering branchOrdering = new PupilBranchOrdering();

		TreeSet<Pupil> PupilSet = new TreeSet<Pupil>(branchOrdering);

		PupilSet.add(s5);
		PupilSet.add(s6);
		PupilSet.add(s1);
		PupilSet.add(s2);
		PupilSet.add(s3);
		PupilSet.add(s4);

		for (Pupil s : PupilSet) {
			s.pupilInfo();
		}
	}
}