package com.ustglobal.excepton.customchecked;

public class InvalidAmountException extends Exception {

	private String message="Daily limits is 40000";
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
}
