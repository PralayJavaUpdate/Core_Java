package com.nt.exception;

public class ExceptionPropagation {

	public static void main(String[] args) {
		System.out.println("main start");
		try{
			m1();
		}
		catch(ArithmeticException ae){
			System.out.println("main end");
		}
	}
	
	static void m1() {
		/*try{
			System.out.println("In try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("In catch");
		}*/
		
		System.out.println(10/0);
	}

}
