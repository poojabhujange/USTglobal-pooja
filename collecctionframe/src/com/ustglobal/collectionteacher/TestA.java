package com.ustglobal.collectionteacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		Teacher e1 = new Teacher(101, "pooja", 20000);
		Teacher e2 = new Teacher(102, "pallavi",30000);
		Teacher e3 = new Teacher(103, "pari", 60000);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println("=======for loop========");
		
		for (int i = 0; i < al.size(); i++) {
			
			Teacher s = al.get(i);
			
			System.out.println("Id is"+s.id);
			System.out.println("name is"+s.name);
            System.out.println("percentage"+s.salary);		      
		}
		
		System.out.println("======for each=======");
		
		for (Teacher s5 : al) {
			System.out.println(s5);
			
		}
		
	
	System.out.println("=========Iterator=============");
	
	Iterator<Teacher> it=al.iterator();
	    while (it.hasNext()) {
	  	Object o=it.next();
	  	System.out.println(o);
	  }
	    System.out.println("==========backword======");
	    ListIterator<Teacher> lt =al.listIterator();
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
