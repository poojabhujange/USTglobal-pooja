package com.ustgobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustgobal.springcore.di.Cat;
import com.ustgobal.springcore.di.Dog;
import com.ustgobal.springcore.di.Pet;


@Configuration
public class PetConfigurationClass {
	
	@Bean(name="Dog")
	public Dog getDog(){
		return new Dog() ;                                                 
	}
	
	@Bean(name="cat")
	public Cat getCat(){
		return new Cat();
	}
	
	@Bean(name="pet")
	public Pet getpet(){
		Pet pet = new Pet();
		pet.setName("Bittu");
		//pet.setAnimal(getDog());//wiyaring the dog
		return pet;
	}
	
	

}
