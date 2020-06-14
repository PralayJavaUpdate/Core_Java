package com.nt.exception;

public class TestVarCreationInTry4 {

	public static void main(String[] args) {
		m1();
	}
	static void m1(){
		int a=-1;
		try{
			a=10;
			System.out.println(a);
		}
		catch (ArithmeticException e) {
			a=20;
			System.out.println(a);
		}
		finally{
			System.out.println(a);
		}
		System.out.println(a);
	}

}
