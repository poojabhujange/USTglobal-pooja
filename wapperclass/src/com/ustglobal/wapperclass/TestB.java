package com.ustglobal.wapperclass;

public class TestB {

	public static void main(String[] args) {
		long a =10;
		System.out.println("a is"+a);
        Long i =a;//autoboxing
        System.out.println("i is "+i);
        
        Long x=(long) 20;
        System.out.println("x is"+x);
        long y =x;//unboxing
        System.out.println("y is " +y);
	}

}
