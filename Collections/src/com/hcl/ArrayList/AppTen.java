package com.hcl.ArrayList;

//program to store user-defined objects into an ArrayList

import java.util.ArrayList;
import java.util.Iterator;

class Employ{
	
	private int id;
	private String name;
	private double salary;
	
	public Employ() {
		// TODO Auto-generated constructor stub
	}

	public Employ(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

public class AppTen{

	public static void main(String[] args) {
		

		ArrayList<Employ>  empList=new ArrayList<Employ>();
		
		Employ e1=new Employ(101,"Roja",45000.25);
		Employ e2=new Employ(102,"Raman",55000.25);
		Employ e3=new Employ(103,"Suman",65000.25);
		Employ e4=new Employ(104,"Mickale",75000.25);
		Employ e5=new Employ(105,"Suman",65000.25);
		
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
	
		for(Employ emp:empList) {
			System.out.println(emp.getId()+" "+emp.getName()+"  "+emp.getSalary());
		}
		
		
		System.out.println("----------employ salary>50000-----------");
		
		Iterator<Employ> iterator = empList.iterator();
		
		while(iterator.hasNext()) {
			
			Employ employ = iterator.next();
			
			if(employ.getSalary()>50000) {
				System.out.println(employ.getId()+" "+employ.getName()+"  "+employ.getSalary());
			}
			
		}		
		
		
	}

}
