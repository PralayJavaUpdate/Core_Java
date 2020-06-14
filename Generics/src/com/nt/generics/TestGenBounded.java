package com.nt.generics;

public class TestGenBounded<t extends Number> {

	public static void main(String[] args) {
		TestGenBounded<Integer> t1=new TestGenBounded<Integer>();
		//TestGenBounded<String> t2=new TestGenBounded<String>();

	}

}
