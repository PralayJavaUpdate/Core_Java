package com.nt.multithreading;

public class Test01_ThreadNameAndPriority {

	public static void main(String[] args) {
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread("Child2");
		
		System.out.println("mt1 Thread's initial name and priority");
		System.out.println("mt1 name: "+mt1.getName());
		System.out.println("mt1 priority: "+mt1.getPriority());
		
		System.out.println();
		
		System.out.println("mt2 Thread's initial name and priority");
		System.out.println("mt2 name: "+mt2.getName());
		System.out.println("mt2 priority: "+mt2.getPriority());
		
		System.out.println();
		
		mt1.setName("Child1");
		mt1.setPriority(6);
		
		System.out.println("mt1 Thread's changed name and priority");
		System.out.println("mt1 name: "+mt1.getName());
		System.out.println("mt1 priority: "+mt1.getPriority());
		
		mt1.start();
		mt2.start();
		for(int i=1;i<=5;i++) {
			System.out.println("main"+i);
		}
	}

}
