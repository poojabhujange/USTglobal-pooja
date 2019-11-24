package com.ustglobal.excepton.customunchecked;

public class InvalidAgeException extends RuntimeException {
	String message = "Invalid age below 18year not allowed";
	public InvalidAgeException(){
		
	}
	public InvalidAgeException(String message){
		this.message = message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	//public String getMessage() {
	//	return message;
	//}

}
