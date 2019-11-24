package com.ustglobal.exception.first;

public class PVR {
public void book(){
	System.out.println("start");
	try{
		System.out.println(10/0);
	    System.out.println("logic for booking");
	    System.out.println("booking is confirmed");
	   }catch(ArithmeticException ae){
		System.out.println("booking failed");
		throw ae;
	   }
	   System.out.println("end");
}
}
