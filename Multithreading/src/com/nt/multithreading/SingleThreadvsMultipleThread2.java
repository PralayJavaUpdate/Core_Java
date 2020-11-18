package com.nt.multithreading;

public class SingleThreadvsMultipleThread2 extends Thread {

	static PrintNumber pn=new PrintNumber();
	public void run() {
		pn.print50To1();
	}
	public static void main(String[] args) {
		
		SingleThreadvsMultipleThread2 stmt=new SingleThreadvsMultipleThread2();
		stmt.start();
		long t1=System.currentTimeMillis();
		
		SingleThreadvsMultipleThread2 stmt1=new SingleThreadvsMultipleThread2();
		
		pn.print50To1();
		long t2=System.currentTimeMillis();
		
		System.out.println("Total complete task "+((t2-t1)/1000)+" sec");
	}

}
