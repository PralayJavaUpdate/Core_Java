package com.nt.exception;

public class TestVarCreationInTry2 {

	public static void main(String[] args) {
		m1();
	}
	static void m1(){
		int a;
		//int a=-1;
		try{
			a=10;
			System.out.println(a);
			System.out.println(10/0);
		}
		catch (NullPointerException e) {
			a=20;
			System.out.println(a);
		}
		catch (Exception e) {
			//a=30;
			System.out.println(a);
		}
		/*finally{
			a=40;
			System.out.println(a);
		}*/
		System.out.println(a);
	}

}
