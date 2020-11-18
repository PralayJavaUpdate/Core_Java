package com.nt.exception;

class C{
		 void m1() throws InterruptedException{}
	}
class F{
	static void m2() throws ClassNotFoundException{
		System.out.println("Hello Bro");
	}
}
	public class TestThrows2 extends C {
		TestThrows2(){
			m1();
		}
		 void m1(){
			 try{
				 F.m2();
			 }
			 catch(ClassNotFoundException cnf){}
		 }
		// m1();
		public static void main(String[] args){
				System.out.println("Hello");
				
				TestThrows2 t1=new TestThrows2();
				 
				t1.m1();
		}

}
