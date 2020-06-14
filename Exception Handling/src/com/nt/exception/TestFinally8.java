package com.nt.exception;

public class TestFinally8 {

	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println(m1());
		System.out.println("main end");
	}
	
	static int m1(){
		System.out.println("m1 start");
		int i=0;
		while(++i<=5){
			System.out.println("while start i"+i);
			try{
				System.out.println("In try"+i);
				return 10;
			}
			finally{
				System.out.println("In finally "+i);
				System.out.println("break is executed");
				System.out.println();
				break;
			}
		}
		System.out.println("After while loop");
		System.out.println("m1 end");
		return 20;
	}
	

}
