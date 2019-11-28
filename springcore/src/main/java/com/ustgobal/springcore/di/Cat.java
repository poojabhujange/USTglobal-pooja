package com.ustgobal.springcore.di;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{

	@Override
	public void makesound() {
		System.out.println("mioooo miooo");
	}

}
