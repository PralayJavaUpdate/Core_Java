package com.nt.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.sql.SQLException;

class A{
		 void m1() throws Exception{}
	}
	
	public class TestThrows extends A {
		//void m1() throws RuntimeException{
		 void m1() throws IOException,InterruptedIOException{}
		public static void main(String[] args) throws Exception{
			
			TestThrows t=new TestThrows();
			//try{
				t.m1();
				System.out.println("Hello");
		/*	}
			catch(Exception e){
				
			}*/
		}

}
