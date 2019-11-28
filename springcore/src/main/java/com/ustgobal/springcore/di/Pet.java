package com.ustgobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pet {
	
	
	public Pet(String name, Animal animal){
		this.animal=animal;
		this.name=name;
	}
	
      public Pet () {
		
	}

	private String name;
	@Autowired
    @Qualifier("cat")
    private Animal animal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}



	
	

}
