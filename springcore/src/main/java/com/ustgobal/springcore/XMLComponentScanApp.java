package com.ustgobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustgobal.springcore.di.Hello;
import com.ustgobal.springcore.di.Pet;

public class XMLComponentScanApp {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I love my India");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
	
		pet.setName("juli");
		
		System.out.println(pet.getName());
		
		pet.getAnimal().makesound();
		
		
	}

}
