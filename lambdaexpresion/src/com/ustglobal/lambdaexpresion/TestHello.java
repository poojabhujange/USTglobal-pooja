package com.ustglobal.lambdaexpresion;

public class TestHello {
 public static void main(String[] args) {
	Hello h =()->"Hi";
	String value = h.say();
	System.out.println("say "+value);
}
}
