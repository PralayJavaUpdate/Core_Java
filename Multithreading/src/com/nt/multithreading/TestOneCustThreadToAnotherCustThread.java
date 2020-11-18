package com.nt.multithreading;

public class TestOneCustThreadToAnotherCustThread {

	public static void main(String[] args) {
		MyThread2 th2=new MyThread2();
		th2.start();

	}

}
