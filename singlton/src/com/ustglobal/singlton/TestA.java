package com.ustglobal.singlton;

public class TestA {
	public static void main(String[] args) {
		MySingalton ms=MySingalton.getDbConnection();
		ms.s ="Hello";
		System.out.println("Hashcode is ms "+ms.hashCode());
		MySingalton mx=MySingalton.getDbConnection();
		mx.s="Hi";
		System.out.println("Hashcode is "+mx.hashCode());
		System.out.println(ms.s);
		System.out.println(mx.s);
		
	}

}
