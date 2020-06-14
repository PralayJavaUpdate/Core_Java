package com.nt.exception;

import java.io.IOException;

import javax.management.RuntimeErrorException;

class D{
		 void m1() throws InterruptedException{}
	}
class E{
	static void m2() throws ClassNotFoundException{
		System.out.println("Hello Bro");
	}
}
	public class TestThrows3 extends D {
		 void m1(){
			 try{
				 E.m2();
			 }
			 catch(ClassNotFoundException cnf){
				 throw new UnsupportedOperationException(cnf);
			 }
		 }
		public static void main(String[] args){
				System.out.println("Hello");
				
				TestThrows2 t1=new TestThrows2();
				t1.m1();
		}

}
