package com.vcs.ws.exceptions;

public class FloorDaoImplException extends Exception {

	private static final long serialVersionUID = 1L;

	public FloorDaoImplException(){
		
		super();
	}
	
	public FloorDaoImplException(String msg){
		
		super(msg);
	}
	
	public FloorDaoImplException(String msg,Throwable t){
		
		super(msg,t);
	}
	
	public FloorDaoImplException(Throwable t){
		
		super(t);
	}
	
}
