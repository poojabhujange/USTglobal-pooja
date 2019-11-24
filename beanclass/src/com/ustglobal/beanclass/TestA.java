package com.ustglobal.beanclass;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s =new Student();
s.setId(12);
s.setName("Shivkami");
s.setRollno(12334);
Database d = new Database();
d.recive(s);
	}

}
