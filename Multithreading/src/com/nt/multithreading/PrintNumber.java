package com.nt.multithreading;

public class PrintNumber {

	//task1
	void print1To50() {
		for(int i=0;i<=50;i++) {
			System.out.println(i+"\t");
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
			}
		}
	}
	
	//task1
	void print50To1() {
	for(int i=50;i>=1;i--) {
		System.out.println(i+"\t");
		try {
			Thread.sleep(100);
		}
		catch(Exception e) {
			
		}	
	 }
	}
}
