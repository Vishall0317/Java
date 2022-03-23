
//program to demonstrate producer-consumer problem.

package com.hcl.multithreading.advance;

class Shop {
	private int stock;
	private int flag = 0; // flag=0 stock is not there, flag=1 stock is available

	public synchronized void produceStock(int stock) {
		try {
			if (flag == 0)
				notify();
			else
				wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("producer produced stock: " + stock);
		this.stock = stock;
		flag = 1;
	}

	public synchronized void consumeStock() {
		try {
			if (flag == 0)
				wait();
			else
				notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("consumer consumed stock: " + stock);
		stock = 0;
		flag = 0;
	}
}

class ShopFactory {
	public static Shop shop = new Shop();
}

class Producer extends Thread {

	public void run() {

		try {
			for (int i = 1; i <= 10; i++) {
				ShopFactory.shop.produceStock(i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("exception is: " + e.getMessage());
		}
	}

}

class Consumer extends Thread {

	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				ShopFactory.shop.consumeStock();
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("exception is: " + e.getMessage());
		}
	}

}

public class AppOne {

	public static void main(String[] args) throws InterruptedException {

		Producer p1 = new Producer();
		p1.start();

		Consumer c1 = new Consumer();
		c1.start();
			
	}
}
