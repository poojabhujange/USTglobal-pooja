package com.ustgobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustgobal.springcore.config.ConfigationBook;

public class BookAnotation {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigationBook.class);

	}

}
