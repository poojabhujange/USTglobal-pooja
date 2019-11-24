package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(45);
		hs.add("deepa");
		hs.add(56.7);//no insertion order
		hs.add(12);//no duplication
		hs.add(null);
		hs.add(null);//only one null
		System.out.println("***********using for each******");
		for(Object o :hs){
			System.out.println(o);
		}
		System.out.println("**********using for each********");
		Iterator it = hs.iterator();
		while(it.hasNext()){
			Object s =it.next();
			System.out.println(s);
		}
		
	}

}
