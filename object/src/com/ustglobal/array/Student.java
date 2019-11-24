package com.ustglobal.array;

public class Student {

	int id;
	String name;
	double markes;
	public Student(int id, String name, double markes) {
		super();
		this.id = id;
		this.name = name;
		this.markes = markes;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", markes=" + markes + "]";
	}
	
	
	
}
