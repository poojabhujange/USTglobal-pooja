package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestE {
	public static void main(String[] args) {
		LinkedHashSet<Double> ls = new LinkedHashSet<>();
		 ls.add(12.3);
		 ls.add(23.4);
		 ls.add(89.0);
		 ls.add(46.8);
		 
		 System.out.println("***********using for each********");
	    for(double a1:ls){
		  System.out.println(a1);
	  }
	    System.out.println("********using iterator********");
	    Iterator<Double> it = ls.iterator();
		while(it.hasNext()){
			Object s =it.next();
			System.out.println(s);
		}
	}

}
