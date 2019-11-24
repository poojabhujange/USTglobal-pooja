package com.ustglobal.strem.list;

import java.util.ArrayList;

import com.ustglobal.java8features.Student;

public class TestH {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(5,"vikram",56.8));
		al.add(new Student(4,"vik",34.7));
		al.add(new Student(8,"sam",50.7));
		al.add(new Student(6,"poo",38.7));
		al.add(new Student(7,"pari",40.7));
		
		Helper h = new Helper();
		//h.displayAllStudent(al);
		//h.displayFailstudent(al);
	 // h.displaypasserstudent(al);
		h.topperOfClass(al);
		
		
	}

}
