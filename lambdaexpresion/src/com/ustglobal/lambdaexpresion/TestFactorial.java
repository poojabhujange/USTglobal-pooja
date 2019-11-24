package com.ustglobal.lambdaexpresion;

public class TestFactorial {
public static void main(String[] args) {
	FactorialInterface fac=(n)->{
		int fact =1;
		for(int i=2;i<n;i++){
			fact=fact*i;
		}
	   return fact;
};
	int f= fac.factorial(6);
	System.out.println(f);
	
}
}
