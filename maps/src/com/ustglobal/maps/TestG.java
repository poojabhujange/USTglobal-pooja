package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		Employee s1 = new Employee(2, "divya", 67000.89);
		Employee s2 = new Employee(5,"ambika",89000.01);
		Employee s3 = new Employee(12,"kiran",880000.01);
		Employee s4 = new Employee(34,"abhishak",78000.01);
		Employee s5 = new Employee(1,"schin",50000.01);
		Employee s6 = new Employee(8,"abhijet",780000.01);
		Employee s7 = new Employee(6,"adity",67000.01);
		Employee s8 = new Employee(7,"daya",9800.01);
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		ArrayList<Employee> al3 = new ArrayList<Employee>();	
		al3.add(s7);
		al3.add(s8);
		HashMap<String,ArrayList<Employee>> hm=new HashMap<>();
		hm.put("first", al1);
		hm.put("second",al2);
		hm.put("third", al3);
		ArrayList<Employee> first =hm.get("second");
		

		Iterator<Employee> it=first.iterator();
		
		while(it.hasNext()){
			Employee s = it.next();
		System.out.println("id is "+s.id);
		System.out.println("name is"+s.name);
		System.out.println("salary"+s.salary);
		System.out.println("=======================");
		
		}
		
	}

}
