package com.ustglobal.excepton.customunchecked;

public class TestA {
public static void main(String[] args) {
	System.out.println("started");
	Validator v = new Validator();
	try{
		v.verify(12);
	}catch(InvalidAgeException ie){
		System.out.println("exception occure");
	}
	v.verify(13);
	System.out.println("main ended");
}
}
