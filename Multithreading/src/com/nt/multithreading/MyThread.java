package com.nt.multithreading;

public class MyThread extends Thread {
	MyThread() {
		super();
	}
	MyThread(String name){
		super(name);
	}
	MyThread(Runnable target){
		super(target);
	}
	
	public void run(){
		System.out.println("From MyThread.run()");
	}
	
}
