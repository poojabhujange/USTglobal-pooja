package com.ustglobal.lambdaexpresion;

public class TestSquare {
    public static void main(String[] args) {
		SquareInterface sq=x->x*x;
		int value=sq.square(4);
		System.out.println(value);
				
    }
}
