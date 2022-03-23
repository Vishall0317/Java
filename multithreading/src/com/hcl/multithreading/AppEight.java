//program to demonstrate collect ticket and show seat with threads.

package com.hcl.multithreading;

class Theater{

	String msg;

	public Theater(String msg) {
		this.msg = msg;
	}

	public void showSeat() {
		System.out.println("show seat to " + msg);
	}
}

class TrThread extends Thread {

	String msg;
	private static Theater t = null;

	public TrThread(String msg) {
		System.out.println("ticket collected is:"+msg);
		t = new Theater(msg);
	}

	@Override
	public void run() {
		try {
		t.showSeat();
		Thread.sleep(600);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class AppEight {

	public static void main(String[] args) throws InterruptedException{

		for (int i = 1; i <= 10; i++) {
			TrThread t1 = new TrThread("Ticket-"+(1200+i));
			t1.start();
			Thread.sleep(200);
			
		}
	}

}