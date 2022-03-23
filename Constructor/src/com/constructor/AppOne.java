package com.constructor;

class Employ{
	int id;
	String name;
	double salary;
	/**
	 * constructor should have same name as class name.
	 * constructor does not have any return type.
	 * when object is created constructor automatically called. 
	 */
	public Employ() {
		id=101;
		name="shah";
		salary=12000;
		
	}
	
	public Employ(int a,String b, double c) {
	
		id=a;
		name=b;
		salary=c;
		
	}
	
}

public class AppOne {

	public static void main(String[] args) {
		
		Employ employ=new Employ();  //crate object as well as call constructor

		System.out.println(employ.id+" "+employ.name+" "+employ.salary);
		
		Employ employ1=new Employ(102, "jahan", 13000);  

		System.out.println(employ1.id+" "+employ1.name+" "+employ1.salary);
	}

}
