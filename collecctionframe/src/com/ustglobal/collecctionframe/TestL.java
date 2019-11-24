package com.ustglobal.collecctionframe;

import java.util.ArrayList;

public class TestL {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101,"Ankitha",45.55);
		Student s2 = new Student(102,"Ankit",48.55);
		Student s3 = new Student(103,"Ank",40.55);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for (int i = 0; i < al.size(); i++) {
			Student s= al.get(i);
			System.out.println("Id is"+s.id);
			System.out.println("name is"+s.name);
            System.out.println("percentage"+s.percentage);		
            
		}
		System.out.println("=============");
		for (Student s : al) {
			System.out.println(s);
			
		}
		
		
	}

}
