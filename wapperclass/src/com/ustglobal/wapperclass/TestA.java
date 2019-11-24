package com.ustglobal.wapperclass;

public class TestA {

	public static void main(String[] args) {
		int a =10;
		System.out.println("a is"+a);
        Integer i =a;//autoboxing
        System.out.println("i is "+i);
        
        Integer x =20;
        System.out.println("x is"+x);
        int y =x;//unboxing
        System.out.println("y is " +y);
        
        int value = Integer.parseInt("123");
        System.out.println("value is"+value);
        
        boolean result = Boolean.parseBoolean("true");
        System.out.println("Result" + result);
        
        int value1 = Integer.parseInt("123wdjb");
        System.out.println("value is"+value1);
        
        boolean result1 = Boolean.parseBoolean("sddsdugw");
        System.out.println("Result" + result1);
        
	}

}
