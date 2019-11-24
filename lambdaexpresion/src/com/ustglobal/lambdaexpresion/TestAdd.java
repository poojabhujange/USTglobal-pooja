package com.ustglobal.lambdaexpresion;

public class TestAdd implements AddInterface{
public static void main(String[] args) {
  TestAdd t1 = new TestAdd();
  int sum = t1.add(12, 20);
  System.out.println("sum is"+sum);
}

public int add(int a, int b) {
	return a*b;
	// TODO Auto-generated method stub
	
}
}
