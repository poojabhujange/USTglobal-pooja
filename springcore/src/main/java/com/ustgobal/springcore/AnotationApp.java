package com.ustgobal.springcore;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.ustgobal.springcore.config.HelloConfigurationClass;
import com.ustgobal.springcore.di.Animal;
import com.ustgobal.springcore.di.Hello;
import com.ustgobal.springcore.di.Pet;

public class AnotationApp {
	public static void main(String[] args) {
		
	
	//ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfigurationClass.class);//use to close the dat

	
	
	Hello hello = context.getBean(Hello.class);
	System.out.println(hello.getMsg());
	
	Hello hello2 = context.getBean(Hello.class);
	System.out.println(hello);
	System.out.println(hello2);
	/*
	Animal animal = context.getBean(Animal.class);
	animal.makesound();*/
	
	
	System.out.println("*****************************");
	
	Pet pet = context.getBean(Pet.class);
	System.out.println(pet.getName());
	
	pet.getAnimal().makesound();
    context.close();
	}
		
}
