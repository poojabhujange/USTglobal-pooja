package com.ustglobal.typecast.reference;

public class TestA {

	public static void main(String[] args) {
		pen p1 = new pen();
		pen p2 = new Marker();//upcasting
		System.out.println(p2.cost);
		p2.write();
		Marker m = (Marker) p2;//downcasting
		System.out.println(m.size);
		m.color();
	}
	
}
