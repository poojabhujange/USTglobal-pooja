package com.ustglobal.java8features.predicate;

import java.util.function.Supplier;

import com.ustglobal.java8features.Student;

public class TestE { 
	public static void main(String[] args){
		Supplier<Student> s=()-> new Student(2,"ajay",45.6);
		Student s1=s.get();
		System.out.println("id is"+s1.id);
		System.out.println("name is"+s1.name);
		System.out.println("percentages "+s1.percentage);
		
		Supplier<Integer> i=()->20;
		int val =i.get();
		System.out.println("value is"+val);
		
		Supplier<String> sp =()->"GOOD Evening";
		String v = sp.get();
		System.out.println("value"+v);
			
	}

}
