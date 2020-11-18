package com.nt.multithreading;

class MyThread4 extends Thread{
//	static {
//		Thread.currentThread().interrupt();
//	}
	public void run() {
		System.out.println("run start");
		System.out.println("run paused");
				
		try {
			//Thread.currentThread().interrupt();
			Thread.sleep(8000);
		}
		catch(InterruptedException ie) {
			System.out.println("IE raised");
		}
		System.out.println("run resumed");
		System.out.println("run paused");
		
		try {
			//Thread.currentThread().interrupt();
			Thread.sleep(8000);
		}
		catch(InterruptedException ie) {
			System.out.println("IE raised");
		}
		System.out.println("run resumed");
		System.out.println("run end");
		
	}
}
public class TestInterrupt {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread4 mt=new MyThread4();
		//mt.interrupt();
		mt.start();
		//mt.interrupt();
		
		//Thread.sleep(4000);
		Thread.currentThread().interrupt();
		Thread.sleep(5000);
		
		
		System.out.println("main end");
	}

}
