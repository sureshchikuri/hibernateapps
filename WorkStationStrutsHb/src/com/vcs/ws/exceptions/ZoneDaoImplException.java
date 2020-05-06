package com.vcs.ws.exceptions;

public class ZoneDaoImplException extends Exception {

	private static final long serialVersionUID = 1L;

	public ZoneDaoImplException(){
		
		super();
	}
	
	public ZoneDaoImplException(String msg){
		
		super(msg);
	}
	
	public ZoneDaoImplException(String msg,Throwable t){
		
		super(msg,t);
	}
	
	public ZoneDaoImplException(Throwable t){
		
		super(t);
	}
	
}
