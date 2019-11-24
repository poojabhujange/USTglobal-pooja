package com.ustglobal.collecctionframe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
   public static void main(String[] args) {
	LinkedList li = new LinkedList();
	li.add(12);
	
	li.add(22.3);
	li.add("pooja");
	li.add(true);
	li.add(null);
	li.add('s');
	System.out.println("=using for loop+=====");
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
		
	}
	System.out.println("====using for each=======");
	for (Object o3 : li) {
		System.out.println(o3);
		
	}
	Iterator it=li.iterator();
	
	while (it.hasNext()) {
		Object o=it.next();
		System.out.println(o);
	}
	System.out.println("======using list iterator======");
    ListIterator lt =li.listIterator();
    while(lt.hasNext()){
    	Object o1=it.next();
		System.out.println(o1);
   	
    }
    
    System.out.println("==========backword======");
   while(lt.hasPrevious()){
	   Object o1= lt.previous();
		System.out.println(o1);
	   
   }
   }
}
