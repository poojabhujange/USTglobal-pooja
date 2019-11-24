package com.ustglobal.strem.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.ustglobal.java8features.Student;

public class Helper {
	void displayAllStudent(ArrayList<Student> l){
		Iterator<Student> it = l.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
            System.out.println("======================");		
		}
	
	}
	void displayFailstudent(ArrayList<Student> al){
		List<Student> l1=al.stream().filter(Student ->Student.percentage<40).collect(Collectors.toList());
		Iterator<Student> it = al.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
            System.out.println("======================");
		
		
	}

	}
	void displaypasserstudent(ArrayList<Student> al1){
		List<Student> l2=al1.stream().filter(Student ->Student.percentage>=40).collect(Collectors.toList());
		Iterator<Student> it = al1.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percentage);
            System.out.println("======================");
		
		
	}

	}
	
	Comparator<Student> cmp=(s1,s2) ->{
	if(s1.percentage>s2.percentage){
		return 1;
		
	}else if(s1.percentage<s2.percentage){
		return -1;
		
	}else{
		return 0;
	}
};

void topperOfClass(ArrayList<Student> al3){
Student s=al3.stream().max(cmp).get();
System.out.println(s);
System.out.println(s.id);
System.out.println(s.name);
System.out.println(s.percentage);
System.out.println("======================");

}
	
	
	
}
