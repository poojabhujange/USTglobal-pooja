package com.ustgobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustgobal.springcore.di.Auther;
import com.ustgobal.springcore.di.Book;

public class AppBook {
	
	public static void main(String[] args) {
		
    	ApplicationContext context = new ClassPathXmlApplicationContext("bookbean.xml");
       
    	Auther athour= context.getBean(Auther.class);
    	
    	System.out.println(athour.getName());
    	System.out.println(athour.getPenname());
    	
    	System.out.println(athour.getBook().getName());
    	System.out.println(athour.getBook().getAuther());
    	System.out.println(athour.getBook().getPrice());
    	
    	
		
	}

}
