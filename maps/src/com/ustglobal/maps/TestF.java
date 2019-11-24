package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
  public static void main(String[] args) {
	Student s1 = new Student(2, "divya", 67.89);
	Student s2 = new Student(5,"ambika",89.01);
	Student s3 = new Student(12,"kiran",88.01);
	Student s4 = new Student(34,"abhishak",78.01);
	Student s5 = new Student(1,"schin",50.01);
	Student s6 = new Student(8,"abhijet",78.01);
	Student s7 = new Student(6,"adity",67.01);
	Student s8 = new Student(7,"daya",98.01);
	ArrayList<Student> al1 = new ArrayList<Student>();
	al1.add(s1);
	al1.add(s2);
	al1.add(s3);
	ArrayList<Student> al2 = new ArrayList<Student>();
	al2.add(s4);
	al2.add(s5);
	al2.add(s6);
	ArrayList<Student> al3 = new ArrayList<Student>();	
	al3.add(s7);
	al3.add(s8);
	HashMap<String,ArrayList<Student>> hm=new HashMap<>();
	hm.put("first", al1);
	hm.put("second",al2);
	hm.put("third", al3);
	ArrayList<Student> first =hm.get("second");
	
	
	Iterator<Student> it=first.iterator();
	
	while(it.hasNext()){
		Student s = it.next();
	System.out.println("id is "+s.id);
	System.out.println("name is"+s.name);
	System.out.println("percentage"+s.percentage);
	System.out.println("=======================");
	}
	
	
	

	
	

	
	
	
}
}
