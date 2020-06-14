package com.nt.exception;

public class TestThrowThrows1 {
	public static void main(String[] args){
		try{
			m1();
		}
		catch(InterruptedException ie){
			System.out.println("Fuck you");
		}
	}
	static void m1() throws InterruptedException{
		try{
			System.out.println("Hello Baby");
			throw new InterruptedException();
		}
		/*finally{
			
		}*/
		
	}
}

