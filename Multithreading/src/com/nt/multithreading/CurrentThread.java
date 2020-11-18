package com.nt.multithreading;

class Example{
	static {
		Thread th=Thread.currentThread();
		System.out.println("CurrentThread class is loaded from static block:"+th.getName());
		//th.setName("Child1");
		//System.out.println("CurrentThread class is loaded through Thread after set Thread name:"+th.getName());
		System.out.println();
	}

	
	/*
	 * Example(){ Thread th=Thread.currentThread();
	 * System.out.println("CurrentThread class is executing from constructor:"+th.
	 * getName()); System.out.println(); }
	 */
	 
	 static void m1(){
		Thread th=Thread.currentThread();
		System.out.println("CurrentThread class m1() is executing in the Thread:"+th.getName());
		//th.setName("Child2");
		//System.out.println("CurrentThread class is loaded through Thread after set Thread name:"+th.getName());
		//System.out.println();
	}
}
class MyThread3 extends Thread{
		public void run() {
			//Example e1=new Example();
			//e1.m1();
			//Example.m1();
			//System.out.println(this.getName());
			System.out.println();
			Thread th=Thread.currentThread();
			System.out.println("CurrentThread class run() is executing in the Thread:"+th.getName());
		}
}
public class CurrentThread {
	
	public static void main(String[] args) {
		new MyThread3().start();
		//Example e1=new Example();
		//Example.m1();
		/*
		 * Thread th=new Thread(); 
		 * System.out.println(th); 
		 * 
		 * Thread th1=new Thread("child1"); 
		 * System.out.println(th1); 
		 * 
		 * Thread th2=Thread.currentThread();
		 * System.out.println(th2); 
		 * 
		 * Thread th3=new Thread(); 
		 * System.out.println(th3);
		 */
	}

}
