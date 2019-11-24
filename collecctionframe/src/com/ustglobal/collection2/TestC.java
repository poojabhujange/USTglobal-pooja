package com.ustglobal.collection2;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestC {
	public static void main(String[] args) {
		Vector<Employe> al = new Vector<Employe>();
		Employe e1 = new Employe(101, "pooja", 20000);
		Employe e2 = new Employe(102, "pallavi",30000);
		Employe e3 = new Employe(103, "pari", 60000);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println("=======for loop========");
		
		for (int i = 0; i < al.size(); i++) {
			
			Employe s = al.get(i);
			
			System.out.println("Id is"+s.id);
			System.out.println("name is"+s.name);
            System.out.println("percentage"+s.salary);		      
		}
		
		System.out.println("======for each=======");
		
		for (Employe s5 : al) {
			System.out.println(s5);
			
		}
		
	
	System.out.println("=========Iterator=============");
	
	Iterator<Employe> it=al.iterator();
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
