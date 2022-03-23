
//program to demonstrate the need of Runnable interface

package com.hcl.multithreading;

class Sample{
	String name;
	int priority;
}

class SampleThread extends Sample {

	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(name+" is printing:" + i);
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

public class AppFive {

	public static void main(String[] args) {
		
		SampleThread s1=new SampleThread();
		s1.start();

	}

}
