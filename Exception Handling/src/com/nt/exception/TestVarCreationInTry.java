package com.nt.exception;

public class TestVarCreationInTry {

	public static void main(String[] args) {
		m1();
	}
	static void m1(){
		int a;
		try{
			a=10;
			System.out.println(a);
		}
		catch (ArithmeticException e) {
			a=20;
			System.out.println(a);
		}
		catch (Exception e) {
			a=30;
			System.out.println(a);
		}
		System.out.println(a);
	}

}
