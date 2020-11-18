package com.nt.multithreading;

public class TestOvrStart extends Thread {
	
	public void run() {
		System.out.println("TestOvrStart.run()");
	}
	
	public void start() {
		System.out.println("TestOvrStart.start()");
		super.start();
	}
	public static void main(String[] args) {
		TestOvrStart tos=new TestOvrStart();
		tos.start();
	} 

}
