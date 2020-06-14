package com.nt.exception;

public class TestReturnWithTryCatch {

	public static void main(String[] args) {
		System.out.println(m1());
	}
	
	static int m1(){
		try{
			System.out.println("In try");
			return 10;
		}
		catch (NullPointerException e) {
			System.out.println("In catch");
			//return 20;
		}
		//System.out.println("After try/catch");
		//return 30;
	}
}
