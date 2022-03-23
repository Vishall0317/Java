package com.hcl.multithreading;

class Theater{
	String msg;
	public Theater(String msg) {
		this.msg=msg;
	}
	public void showSeat() {
		System.out.println("show the seat: "+msg);
	}
}
class TThread extends Thread{
	String msg;
	private static Theater t=null;
	public void TrThread(String nsg) {
		new Theater(msg);
	}
	public void run(){
		t.showSeat();
		
	}
}
public class AppTicket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			TThread t=new TThread();
			t.start();
			Thread.sleep(200);
		}
	}

}
