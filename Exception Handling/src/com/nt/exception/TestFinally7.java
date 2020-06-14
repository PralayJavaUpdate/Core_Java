package com.nt.exception;

public class TestFinally7 {

	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1(){
		try{
			System.out.println("In try");
			//System.out.println(10/0);
			
			return 10;
			
		}
		catch (ArithmeticException e) {
			System.out.println("In catch");
		}
		finally{
			System.out.println("In finally");
			if(false)
				return 20;
		}
		System.out.println("After try/catch/finally");
		return 30;
	}

}
