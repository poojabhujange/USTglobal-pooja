package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
   public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	Student s1 = new Student(12, "diMPle", 35.6);
	Student s2 = new Student(13, "Sweety", 30.4);
	Student s3= new Student(2, "JiMmy", 88.99);
	al.add(s1);
	al.add(s2);
	al.add(s3);
	displayStudentDetails(al);
	Collections.sort(al);
	System.out.println("after");
	displayStudentDetails(al);
	}
  static void displayStudentDetails(ArrayList<Student> al){
	   Iterator<Student> it = al.iterator();
	   while(it.hasNext()){
		   Student s = it.next();
		   System.out.println("id is"+s.id);
		   System.out.println("name "+s.name);
		   System.out.println("pecentage "+s.percentage);
		   System.out.println("-------------------------");
	   }
  }
}
