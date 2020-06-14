package com.nt.exception;

public class TestFinally10 {
                                       
	public static void main(String[] args) {
		m1();
	}
	static void m1(){
		try{
			System.out.println("In outer try");
			try{
				System.out.println("In inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException npe){
				System.out.println("In inner catch");
			}
			finally{
				System.out.println("In inner finnaly");
			}
			System.out.println("Äfter inner try/catch/finally");
		}
		catch(NullPointerException npe){
			System.out.println("In outer catch");
		}
		finally{
			System.out.println("In outer finnaly");
		}
		System.out.println("Äfter outer try/catch/finally");
	}

}
