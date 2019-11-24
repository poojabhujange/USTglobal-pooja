package com.ustglobal.collection2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestB {
	public static void main(String[] args) {
		LinkedList<Employe> al = new LinkedList<Employe>();
		Employe e1 = new Employe(101, "pooja", 20000);
		Employe e2 = new Employe(102, "pallavi",30000);
		Employe e3 = new Employe(103, "pari", 60000);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println("=======for loop========");
		for (int i = 0; i < al.size(); i++) {
			Employe s= al.get(i);
			System.out.println("Id is"+s.id);
			System.out.println("name is"+s.name);
            System.out.println("percentage"+s.salary);		      
		}
		
		System.out.println("======for each=======");
		for (Employe s : al) {
			System.out.println(s);
		}
		
	  System.out.println("=========Iterator=============");
	   Iterator it=al.iterator();
	    while (it.hasNext()) {
	  	Object o=it.next();
	  	System.out.println(o);
	  }
	    
	    System.out.println("==========backword======");
	    ListIterator<Employe> lt =al.listIterator();
	    while(lt.hasPrevious()){
	       Object o1= lt.previous();
	    	System.out.println(o1);
	       
	    }
   System.out.println("======using list iterator======");  
	    while(lt.hasNext()){
	    	Object o1=it.next();
	    	System.out.println(o1);
	    }
	
	
	}

}
