package com.hcl.HashCode;

//program to get hash codes of two objects.


class Bulb {

	String filment;
	
	public Bulb() {
		filment="off";
	}

	public void turnOn() {
		filment = "on";
		System.out.println("Bulb is ON");
	}

	public void turnOff() {
		filment = "off";
		System.out.println("Bulb is Off");
	}

}

public class AppOne{

	public static void main(String[] args) {
		
		
		Bulb b1=new Bulb();
		b1.turnOn();
		b1.turnOff();
		int hashCode = b1.hashCode();
		
		System.out.println("b1 hashcode is:"+hashCode);
		
		
		Bulb b2=new Bulb();
		
		int hashCode2=b2.hashCode();
		System.out.println("b2 hashcode is:"+hashCode2);
			
		System.out.println("b1.equals(b2) is: "+b1.equals(b2));
		
	}
}
