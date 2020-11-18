package com.nt.multithreading;

public class MyThread2 extends Thread {
	
	public void run() {
		MyThread1 th1=new MyThread1();
		th1.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("Thread2.run"+i);			
		}
	}
}
