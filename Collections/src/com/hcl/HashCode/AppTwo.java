package com.hcl.HashCode;
//program to demonstrate the contract between equals() and hashcode() methods

class Author {

	int authorId;
	String name;

	// if equals method says that the two objects are same, then their hash codes  must be same.

	@Override
	public int hashCode() {
		return authorId*(name.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == ((Author) obj).hashCode();
	}

}

public class AppTwo{

	public static void main(String[] args) {

		Author a1 = new Author();
		a1.authorId = 1001;
		a1.name = "Tagore";

		Author a2 = new Author();
		a2.authorId = 1001;
		a2.name = "Tagore";

		System.out.println(a1.hashCode() + "  " + a2.hashCode());

		System.out.println("a1.equals(a2) is: " + a1.equals(a2));

	}
}
