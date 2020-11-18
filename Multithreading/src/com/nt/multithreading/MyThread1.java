package com.nt.multithreading;

public class MyThread1 extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Thread1.run"+i);
		}
	}
}
