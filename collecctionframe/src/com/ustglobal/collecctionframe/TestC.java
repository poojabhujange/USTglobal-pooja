package com.ustglobal.collecctionframe;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(23);
		a1.add(98.7);
		a1.add(true);
		a1.add("Goodevening");
		Iterator i = a1.iterator();
		
		Object o1 =i.next();
		System.out.println("object"+o1);
		
		Object o2 =i.next();
		System.out.println("object"+o2);
		
		Object o3 =i.next();
		System.out.println("object"+o3);
		
		
		Object o4 =i.next();
		System.out.println("object"+o4);
		
		boolean b = i.hasNext();
		System.out.println(b);

		//Object o5 =i.next();
		//System.out.println("object"+o5);
		//NosuchException
		
		System.out.println("============");
				
		   for(int j=0;j<a1.size();j++){ 
			Object o = a1.get(j);
			System.out.println(o);
			
		}
		   ArrayList al1 = new ArrayList();
		   al1.add(12);
		   al1.add(233.4);
		   al1.add("mom");
		   al1.add(false);
		   
		   System.out.println("=============");
		   Iterator it =al1.iterator();
		  
		   while(it.hasNext()){
			   Object a=it.next();
			   System.out.println(a);
		   }
		   
		   for(;it.hasNext();){
			   Object a11=it.next();
			   System.out.println(a11);
		   }
	}

}
