package com.ustglobal.beanclass.pkg1;

public class Database {
	void recive(Employe e){
		System.out.println("id is"+e.getId());
		System.out.println("salary"+e.getSalary());
		System.out.println(e.getDept());
		System.out.println(e.getDesignation());
		System.out.println(e.getName());
	}

}
