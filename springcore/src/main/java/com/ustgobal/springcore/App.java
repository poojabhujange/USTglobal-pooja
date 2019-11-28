package com.ustgobal.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustgobal.springcore.di.Animal;
import com.ustgobal.springcore.di.Hello;
import com.ustgobal.springcore.di.Pet;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	Hello hello = context.getBean(Hello.class);
    	System.out.println(hello.getMsg());	
    	System.out.println(hello.getMap());
    	
  Hello hello2=context.getBean(Hello.class);

  System.out.println(hello);
  System.out.println(hello2);
  
  Hello hello3=context.getBean(Hello.class);
  System.out.println(hello3);

  Animal animal = context.getBean(Animal.class);
  animal.makesound();
    
  Animal animal2 = (Animal) context.getBean("dog");
  animal2.makesound();
  
  Pet pet = context.getBean(Pet.class);
  System.out.println(pet.getName());
  pet.getAnimal().makesound();
  
  
    }
}
