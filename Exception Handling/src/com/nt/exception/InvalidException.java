package com.nt.exception;

public class InvalidException extends java.lang.Throwable{
		public InvalidException(){
			super();
		}
		public InvalidException(String msg){
			super(msg);
		}
		public InvalidException(Exception e){
			super(e);
		}
}

