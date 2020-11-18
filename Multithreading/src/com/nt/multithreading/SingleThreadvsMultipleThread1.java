package com.nt.multithreading;

public class SingleThreadvsMultipleThread1 {

	public static void main(String[] args) {
		
		PrintNumber pn=new PrintNumber();
		
		long t1=System.currentTimeMillis();
		pn.print1To50();
		
		PrintNumber pn1=new PrintNumber();
		pn1.print50To1();
		long t2=System.currentTimeMillis();
		
		System.out.println("Total complete task "+((t2-t1)/1000)+" sec");
	}

}
