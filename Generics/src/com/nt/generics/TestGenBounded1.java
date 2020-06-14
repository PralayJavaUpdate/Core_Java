package com.nt.generics;

public class TestGenBounded1<t extends Runnable> {

	public static void main(String[] args) {
		TestGenBounded1<Thread> t1=new TestGenBounded1<Thread>();
		//TestGenBounded1<Integer> t1=new TestGenBounded1<Integer>();
		//TestGenBounded<String> t2=new TestGenBounded<String>();

	}

}
