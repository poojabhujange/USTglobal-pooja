package com.ustglobal.object;

public class TestA {
	public static void main(String[] args) {
		Car c = new Car(200, "BWE", "black");
		Car c1 = new Car(600, "Audi", "red");
		Car c2= new Car(900, "maroti", "blue");
		
		int pHashcode = c.hashCode();
		int pHashcode1 = c1.hashCode();
		int pHashcode2 = c2.hashCode();
		
		String s1= c1.toString();
		String s2= c.toString();
		
		String s3= c2.toString();
		
		System.out.println(pHashcode);
		System.out.println(s1);
		System.out.println(pHashcode1);
		System.out.println(s2);
		System.out.println(pHashcode2);
		System.out.println(s3);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
