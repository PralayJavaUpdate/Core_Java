package com.nt.exception;

public class TestFinally12 {

	public static void main(String[] args) {
		try{
			System.out.println(m1());
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	static int m1() throws Exception{
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
				return 20;
			}
			//System.out.println("Äfter inner try/catch/finally");
		}
		catch(NullPointerException npe){
			System.out.println("In outer catch");
		}
		finally{
			System.out.println("In outer finnaly");
			//return 30;
		}
		System.out.println("Äfter outer try/catch/finally");
		return 30;
	}

}
