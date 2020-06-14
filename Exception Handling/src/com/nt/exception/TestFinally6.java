package com.nt.exception;

public class TestFinally6 {

	public static void main(String[] args) {
		m1();
		//System.out.println(m1());
	}
	static void m1(){
		try{
			System.out.println("In try");
			//System.out.println(10/0);
		}
		catch (NullPointerException e) {
			System.out.println("In catch");
		}
		finally{
			System.out.println("In finally");
			//return;
			int[] a=new int[-5];
		}
		//return 30;
	}

}
