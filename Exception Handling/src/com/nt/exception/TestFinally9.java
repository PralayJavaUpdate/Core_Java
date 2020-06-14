package com.nt.exception;

public class TestFinally9 {

	public static void main(String[] args) {
		System.out.println(m1());
	}

	static int m1(){
		try{
			System.out.println("In outer try");
			try{
				System.out.println("In inner try");
			}
			catch(NullPointerException npe){
				System.out.println("In inner catch");
			}
			finally{
				System.out.println("In inner finnaly");
				return 10;
			}
			//System.out.println("Äfter inner try/catch/finally");
		}
		catch(NullPointerException npe){
			System.out.println("In inner catch");
		}
		finally{
			System.out.println("In outer finnaly");
			//return 20;
		}
		System.out.println("Äfter outer try/catch/finally");
		return 20;
	}
}