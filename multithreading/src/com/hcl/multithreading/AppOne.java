


//program to demonstrate find the main thread or currently running thread details

package com.hcl.multithreading;

public class AppOne {

	public static void main(String[] args) {

		System.out.println("program started");

		Thread currentThread = Thread.currentThread();

		System.out.println("current thread: " + currentThread);
		System.out.println("current thread id: " + currentThread.getId());
		System.out.println("current thread name: " + currentThread.getName());
		System.out.println("current thread priority: " + currentThread.getPriority());
		System.out.println("current thread isAlive:" + currentThread.isAlive());
		System.out.println("current thread group:" + currentThread.getThreadGroup());

		currentThread.setName("RaisingStars Thread");
		currentThread.setPriority(7);
		System.out.println("current thread name: " + currentThread.getName());
		System.out.println("current thread priority: " + currentThread.getPriority());		
		
		System.out.println("program ends");

	}

}
