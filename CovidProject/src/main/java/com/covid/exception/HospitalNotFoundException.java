package com.covid.exception;


public class HospitalNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String message2;

	public HospitalNotFoundException(String message2) {
		super();
		this.message2=message2;
	}
	
	public HospitalNotFoundException() {
	}

}