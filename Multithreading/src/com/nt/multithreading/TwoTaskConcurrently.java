package com.nt.multithreading;


public class TwoTaskConcurrently {

	public static void main(String[] args) {
		MyThread1 th1=new MyThread1();
		
		th1.start();
		for(int i=1;i<=10;i++) {
			System.out.println("main"+i);
		}

		//th1.start();
	}

}
