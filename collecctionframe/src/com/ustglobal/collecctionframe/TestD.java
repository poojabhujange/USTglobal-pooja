package com.ustglobal.collecctionframe;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
   public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(45.6);
	al.add("yash");
	al.add(true);
	al.add("yuraj");
	ListIterator li =al.listIterator();
	System.out.println("--------forword--------");
	while(li.hasNext()){
		Object ob = li.next();
		System.out.println(ob);
		
	}
	while(li.hasPrevious()){
		Object o = li.previous();
		System.out.println(o);
	}
}
}
