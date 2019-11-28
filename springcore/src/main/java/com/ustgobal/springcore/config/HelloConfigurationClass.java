package com.ustgobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ustgobal.springcore.di.Cat;
import com.ustgobal.springcore.di.Dog;
import com.ustgobal.springcore.di.Hello;
import com.ustgobal.springcore.di.Pet;

@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {
	
	
	@Bean(name="hello")
	//@Scope("prototype")
	public Hello getHello(){
		Hello hello = new Hello();
		hello.setMsg("jai shivray");
		return hello;
		
		
	}

	
}

