
//program to demonstrate how dead lock occurs

package com.hcl.multithreading.advance;

class Printer {

	public void printFile() {
		synchronized (this) {
			System.out.println("Thread-1 locked Printer");
		}
		try {

			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		synchronized(Resources.xerox) {
			System.out.println("Thread-1 locked Xerox");
		}
	}
}

class Xerox {

	public synchronized void printCopy(String fileName) {
		System.out.println("xeroxing content of file " + fileName);
		try {
			System.out.println("----");
			Thread.sleep(400);

		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("xeroxing end for file " + fileName);
		synchronized (this) {
			Resources.xerox.printCopy(fileName);
		}
	}
}

class Resources {

	public static Xerox xerox = new Xerox();
	public static Printer printer = new Printer();
}

class UserOne extends Thread {

	public void run() {
		Resources.xerox.printCopy("UserOne.txt");
	}
}

class UserTwo extends Thread {

	public void run() {
		Resources.xerox.printCopy("UserTwo.txt");
	}
}

public class AppTwo {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("App started.");

		UserOne one = new UserOne();
		one.start();

		UserTwo two = new UserTwo();
		two.start();

		one.join();
		two.join();
		System.out.println("App ends.");

	}

}
