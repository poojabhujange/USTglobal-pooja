package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
		Student s= new Student(1, "anup", 45.6);
		Predicate<Student> p = s1->{
			if(s.percentage >=35){
				return true;
				
			}else{
				return false;
			}
		};
		Student s1= new Student(1, "anup", 45.6);
        boolean res = p.test(s1);
        System.out.println("result"+res);
	}

}
