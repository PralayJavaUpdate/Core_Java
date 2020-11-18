package com.nt.multithreading;
public class RunOverloading extends Thread { 
   
	 public void run() 
	    { 
		 for(int i=1;i<=10;i++) {
				System.out.println("run"+i);
			}
	    } 
	/*
	 * public void run(String i) { System.out.println("Bishal"); }
	 */


	public static void main(String[] args) {
		RunOverloading t = new RunOverloading(); 
	    //t.start("hello");
		
		t.start();
		t.run();
		
		for(int i=1;i<=10;i++) {
			System.out.println("main"+i);
		}
	    } 
}
