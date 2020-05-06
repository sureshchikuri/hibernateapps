package com.vcs.ws.exceptions;

public class ZoneServiceImplException extends Exception {

	private static final long serialVersionUID = 1L;

	public ZoneServiceImplException(){
		
		super();
	}
	
	public ZoneServiceImplException(String msg){
		
		super(msg);
	}
	
	public ZoneServiceImplException(String msg,Throwable t){
		
		super(msg,t);
	}
	
	public ZoneServiceImplException(Throwable t){
		
		super(t);
	}
	
}
