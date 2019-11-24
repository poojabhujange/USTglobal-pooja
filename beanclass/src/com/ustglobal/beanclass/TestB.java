package com.ustglobal.beanclass;

import java.util.Scanner;

public class TestB {
public static void main(String[] args) {
	System.out.println("Scanner class");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age");
	int age = sc.nextInt();
	System.out.println("age is"+age);
	
	System.out.println("Enter the name");	
	String name = sc.next();
	System.out.println("name is"+name);
	
	System.out.println("Enter the full name");
	String fullname = sc.nextLine();
	System.out.println("fullname is"+fullname);
	
}
}
