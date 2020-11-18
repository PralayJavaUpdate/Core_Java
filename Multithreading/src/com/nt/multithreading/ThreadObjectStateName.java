package com.nt.multithreading;

public class ThreadObjectStateName extends Thread {

	public void run() {
		System.out.println("After start() call----run()"+this.getState()+"---"+this.isAlive()+" "+this.getPriority()+" "+this.getName());
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Thread th=new Thread();
		System.out.println(th.getName());
		
		MyThread mt=new MyThread();
		System.out.println(mt.getName());
		ThreadObjectStateName tosn=new ThreadObjectStateName();
		System.out.println("after Thread created----main()"+tosn.getState()+"---"+tosn.isAlive()+" "+tosn.getPriority()+" "+tosn.getName());
		tosn.start();
		System.out.println("after start() call----main()"+tosn.getState()+"---"+tosn.isAlive()+" "+tosn.getPriority()+" "+tosn.getName());
		Thread.sleep(500);
		System.out.println("after mt.sleep()----main()"+tosn.getState()+"---"+tosn.isAlive()+" "+tosn.getPriority()+" "+tosn.getName());
		Thread.sleep(6000);
		System.out.println("after run() completed----main()"+tosn.getState()+"---"+tosn.isAlive()+" "+tosn.getPriority()+" "+tosn.getName());
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+tosn.getName());
			System.out.println();
		}
	}

}
