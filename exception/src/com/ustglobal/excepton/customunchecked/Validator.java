package com.ustglobal.excepton.customunchecked;

public class Validator {
	void verify(int age){
		if(age<18){
			throw new InvalidAgeException("try agen next time!!");
		}
	}

}
