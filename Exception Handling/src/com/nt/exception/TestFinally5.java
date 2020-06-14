package com.nt.exception;

public class TestFinally5 {

	public static void main(String[] args) {
		//m1();
		System.out.println(m1());
	}
	static int m1(){
		try{
			System.out.println("In try");
			System.out.println(10/0);
		}
		catch (NullPointerException e) {
			System.out.println("In catch");
		}
		finally{
			System.out.println("In finally");
			return 30;
		}
		//return 30;
	}

}
