package com.nt.multithreading;

public class test03_RunExecution {

	public static void main(String[] args) {

		/*Thread th1=new Thread();
		th1.start();
		
		MyThread mt=new MyThread();
		mt.start();
		
		MyRunnable mr=new MyRunnable();
		//mr.start();
		
		Thread th2=new Thread(mr);
		th2.start();
		
		MyThread mt1=new MyThread();
		Thread th3=new Thread(mt1);
		th3.start();
		
		Thread th4=new Thread();
		th4.start();*/
		
		/*//Thread th5=new MyRunnable();
		th5.start();*/
		
		/*Runnable r=new Thread();
		//r.start();*/
		
		/*Runnable r=new MyRunnable();
		Thread th6=new Thread(r);
		th6.start();*/
		
		Runnable r=new MyThread();
		Thread th7=new Thread(r);
		th7.start();
		
	}

}
