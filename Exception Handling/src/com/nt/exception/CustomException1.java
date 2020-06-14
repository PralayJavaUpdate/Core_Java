package com.nt.exception;


public class CustomException1 {

	static void validate(int age) throws InvalidException{
		if(age<18)
			throw new InvalidException("not valid");
		else
			System.out.println("Welcome to vote");
	}
	public static void main(String[] args) {
		try{
		 validate(13);
		}
		catch(Exception e){
			System.out.println("Exception Occured: "+e);
		}
		System.out.println("rest of the code");
	}

}
