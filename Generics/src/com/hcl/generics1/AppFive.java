package com.hcl.generics1;
//program to implement a generic interface

interface Productable<T> {

	<T> T mul(T a, T b);
}

class Producter implements Productable<Producter> {

	@Override
	public <T> T mul(T a, T b) {

		T mul = null;

		if (a instanceof Integer) {
			Integer i1 = (Integer) a;
			Integer i2 = (Integer) b;

			mul = (T) new Integer(i1 * i2);
		}
		return mul;
	}

}

public class AppFive {

	public static void main(String[] args) {

		
		Producter  p1=new Producter();
		
		System.out.println("Product of 12,10 is:"+p1.mul(12, 10));
		
		
		
	}

}
