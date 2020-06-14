package com.nt.exception;

public class TestException {
	
	try{}
	catch(Exception e){}
	
	void m1(){
		try{}
		catch(Exception e){}
	}
	
	void m3(){
		try{}
	}

	void m3(){
		catch(Exception e){}
	}
	
	void m4(){
		finally{}
	}
	
	void m5(){
		try{}
		int a=10;
		catch(Exception e){}
		int b=20;
		finally{}
	}
	
	void m6(){
		try{}
		catch(Exception e){}
		catch(String s){}
	}

	void m7(){
		try{}
		catch(ArithmeticException ae){}
		catch(ArithmeticException ae){}
		
		try{}
		catch(Exception e){}
		catch(ArithmeticException ae){}
	}
	void m8(){
		throw new ArithmeticException();
		int a;
	}
	
	void m9(){
		if(true){
			throw new ArithmeticException();
		}
		int a;
	}
	
	void m10(){
		throw "a";
	}
	
	void m12() throws ArithmeticException{
	
	}
	
	void m13(){
		throw new ArithmeticException();
	}
	
	void m14() throws String{}
	
	void m15(){
		throw new ClassNotFoundException();
	}
	
	void m16(){
		try{}
		catch(ClassNotFoundException cnf){}
	}

	void m17() throws ClassNotFoundException{
			throw new ClassNotFoundException();
	}
	
	void m18(){
		try{
			throw new ClassNotFoundException();
		}
		catch(ClassNotFoundException cnf){}
	}
	
	void m19(){
		try{ Class.forName("habul");}
		catch(ClassNotFoundException cnf){}
	}
	
	void m20(){
		try{}
		catch(ArithmeticException ae){}
	}
	
	void m21(){
		try{}
		catch(ClassNotFoundException cnf){}
		catch(ArithmeticException ae){}
		catch (Exception e) {}
	}
	
	void m22(){
		throw new Exception();
	}
	public static void main(String[] args) {
	}

}
