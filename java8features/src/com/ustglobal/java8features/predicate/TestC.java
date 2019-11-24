package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;


public class TestC {
   public static void main(String[] args) {
	  
		Predicate<Vote> p = s1->{
			if(s1.age >=18){
				return true;
				
			}else{
				return false;
			}
		};
		Vote s1= new Vote(19, "pooja");
       boolean res = p.test(s1);
       System.out.println("result"+res);
}
}
