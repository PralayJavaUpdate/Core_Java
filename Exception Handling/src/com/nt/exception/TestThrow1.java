package com.nt.exception;

public class TestThrow1 {

	public static void main(String[] args) {
		try{
		m1();
		}
		catch(Exception e){
			System.out.println("Hi sexy");
		}
	}

	@SuppressWarnings("unused")
	static void m1() throws ArithmeticException{
		if(true){
			throw new ArithmeticException();
		}
		System.out.println("Hi");
	}
}
