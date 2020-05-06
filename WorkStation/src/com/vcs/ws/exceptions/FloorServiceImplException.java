package com.vcs.ws.exceptions;

public class FloorServiceImplException extends Exception {

	private static final long serialVersionUID = 1L;

	public FloorServiceImplException(){
		
		super();
	}
	
	public FloorServiceImplException(String msg){
		
		super(msg);
	}
	
	public FloorServiceImplException(String msg,Throwable t){
		
		super(msg,t);
	}
	
	public FloorServiceImplException(Throwable t){
		
		super(t);
	}
	
}
