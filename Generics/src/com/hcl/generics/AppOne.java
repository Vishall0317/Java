package com.hcl.generics;

class Operations<T> {

	public <T extends Number> T add(T a, T b) {

		T sum;
		sum = (T) new Integer(a.intValue() + b.intValue());
		return sum;

	}
}

public class AppOne {

	public static void main(String[] args) {

		Operations<Integer> o1 = new Operations<Integer>();

		o1.add(new Integer(10), new Integer(20));

	}

}
