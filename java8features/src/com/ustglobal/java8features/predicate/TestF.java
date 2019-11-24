package com.ustglobal.java8features.predicate;

import java.util.function.Consumer;
import com.ustglobal.java8features.Student;


public class TestF {
public static void main(String[] args) {
	Consumer<Student> c=s->{
		System.out.println("id is"+s.id);
		System.out.println("name is"+s.name);
		System.out.println("percentages "+s.percentage);
		
	};
	Student s1=new Student(2, "bhavani", 67.9);
	c.accept(s1);
}
}
