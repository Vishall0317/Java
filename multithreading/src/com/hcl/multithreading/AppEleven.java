
//program to demonstrate the problem & solution with block-level Thread synchronization


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

class Printerr {

	public void printFile(String file) {
		System.out.println("printer started printing file.." + file);
		try {
			synchronized(this) {
			for(int i=1;i<=10;i++) {
				System.out.println("--");
			}
			}
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("printer done printing file.." + file);
	}
}

class FileThreadd extends Thread {

	String fileName;
	private static Printer p = new Printer();

	public FileThreadd(String fname) {
		fileName = fname;
	}

	public void run() {
		p.printFile(fileName);
	}

}

public class AppEleven {

	public static void main(String[] args) {

		FileThreadd ft1 = new FileThreadd("File-1.txt");

		FileThreadd ft2 = new FileThreadd("File-2.txt");
		
		FileThreadd ft3 = new FileThreadd("File-3.txt");
		
		ft1.start();
		ft2.start();
		ft3.start();
	}
}