package com.ustglobal.hasarelation;

public class TestB {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		c.drive();
		System.out.println("============");
		c.m.music();
		System.out.println(c.m.sname);
	}
}
