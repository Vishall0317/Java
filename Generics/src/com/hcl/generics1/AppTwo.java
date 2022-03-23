package com.hcl.generics1;

//program to demonstrate generic method creation in non-generic class


class Calculation {

	public <T extends Number> T sumOfTwoNumbers(T a, T b) {

		T sum = null;

		if (a instanceof Byte) {

			Byte b1 = (Byte) a;
			Byte b2 = (Byte) b;
			byte byteSum = (byte) (b1 + b2);

			sum = (T) new Byte(byteSum);

		}

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
		return sum;
	}

}

public class AppTwo {

	public static void main(String[] args) {

		Calculation c = new Calculation();

		Integer sum = c.sumOfTwoNumbers(120, 100);

		System.out.println("Integer sum: " + sum);

		Double sumOfDouble = c.sumOfTwoNumbers(12.23, 12.20);

		System.out.println("Double sum: " + sumOfDouble);

		Float sumOfFloat = c.sumOfTwoNumbers(12.2f, 10.2f);

		System.out.println("Float sum: " + sumOfFloat);

	}
}