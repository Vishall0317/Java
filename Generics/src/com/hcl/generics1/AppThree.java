package com.hcl.generics1;

//program to demonstrate generic method creation in non-generic class

class Calculator {

	public <T> T sumOfTwo(T a, T b) {

		T sum = null;

		if (a instanceof Integer) {
			sum = (T) (new Integer((Integer) a + (Integer) b));
		}

		if (a instanceof Float) {
			sum = (T) new Float((Float) a + (Float) b);
		}

		if (a instanceof Double) {
			Double d1 = (Double) a;
			Double d2 = (Double) b;
			sum = (T) new Double(d1 + d2);

		}

		if (a instanceof String) {

			String s1 = (String) a;
			String s2 = (String) b;

			sum = (T) new String(s1 + s2);
		}

		return sum;
	}

}

public class AppThree {

	public static void main(String[] args) {

		Calculator c = new Calculator();

		String sumOfString = c.sumOfTwo("Welcome to ", "Generics");

		System.out.println(sumOfString);

		Integer sum = c.sumOfTwo(120, 100);

		System.out.println("Integer sum: " + sum);

		Double sumOfDouble = c.sumOfTwo(12.23, 12.20);

		System.out.println("Double sum: " + sumOfDouble);
	}
}