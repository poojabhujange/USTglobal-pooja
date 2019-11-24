package com.ustglobal.object;

public class TestD {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person(12,"ravi");
		System.out.println("p id is "+p.id);
		System.out.println("p id is "+p.name);
		
		
		Object o =p.clone();
		
		Person p2 = (Person)o;
		
		System.out.println(p2.id);
		System.out.println(p2.name);
		
		p2.id=200;
		p2.name="surya";
		
		System.out.println("=========after clone=====");
		System.out.println("p id is "+p.id);
		System.out.println("p id is "+p.name);
		System.out.println(p2.id);
		System.out.println(p2.name);
		

	}

}
