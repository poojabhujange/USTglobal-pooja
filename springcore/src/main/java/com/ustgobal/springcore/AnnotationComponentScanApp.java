package com.ustgobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ustgobal.springcore.config.ComponentConfiguration;
import com.ustgobal.springcore.di.Hello;
import com.ustgobal.springcore.di.Pet;

public class AnnotationComponentScanApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);

		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I love my India");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("google");
		System.out.println(pet.getName());
		pet.getAnimal().makesound();
		
	
	
	}

}
