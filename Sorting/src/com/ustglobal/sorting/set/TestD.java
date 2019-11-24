package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestD {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(12);
		ts.add(39);//only genaric
		//ts.add(null); nullpointer exception
        //ts.add("depika");//classcast exception
		System.out.println("*********using for each*********");
		for (Object s : ts) {
			System.out.println(s);	
		}
		System.out.println("*****using iterator*********");
		Iterator it = ts.iterator();
		while(it.hasNext()){
			Object s =it.next();
			System.out.println(s);
		}
	}

}
