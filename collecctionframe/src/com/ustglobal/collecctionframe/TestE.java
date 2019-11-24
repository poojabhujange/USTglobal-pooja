package com.ustglobal.collecctionframe;

import java.util.ArrayList;

public class TestE {
    public static void main(String[] args) {
    	ArrayList al = new ArrayList();
    	al.add("shreya");
    	
   Object o =al.get(0);//all are upcasted to object clss
   String name=(String)o;//so downcast
   
       name= name.toUpperCase();
       System.out.println(name);
	}
}
