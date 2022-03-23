
//program to demonstrate the problem and solution with method-level Thread synchronization.

/*
 * 
 * There is a resource called  "Printer", 
 * which accepts requests from the threads and each thread 
 * submits a file, then the Printer has to accept the requests 
 * and it should print the text from the files. But here printer 
 * print the text from multiple files as the requests are coming from 
 * diff threads simultaneously. then the result will be merged text.
 * 
 * 
 * 
 */
package com.hcl.multithreading;

class Printer {

	public synchronized void printFile(String file) {
		System.out.println("printer started printing file.." + file);
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("--");
			}
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("printer done printing file.." + file);
	}
}

class FileThread extends Thread {

	String fileName;
	private static Printer p = new Printer();

	public FileThread(String fname) {
		fileName = fname;
	}

	public void run() {
		p.printFile(fileName);
	}

}

public class AppTen {

	public static void main(String[] args) {

		FileThread ft1 = new FileThread("File-1.txt");

		FileThread ft2 = new FileThread("File-2.txt");
		
		FileThread ft3 = new FileThread("File-3.txt");
		
		ft1.start();
		ft2.start();
		ft3.start();
	}
}