package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
   public static void main(String[] args) {
		SortByName sb = new SortByName();
		SortByPincode sp = new SortByPincode();
		SortByMicro sm = new SortByMicro();

	TreeSet<Bank> ts = new TreeSet<Bank>(sm);
	Bank b1 = new Bank("HDFC", 67346738, 567882);
	Bank b3 = new Bank("SBI", 236799, 967882);
	Bank b4 = new Bank("CITI", 987098, 867882);
	Bank b2 = new Bank("INDIAN", 8798348, 347882);
	Bank b5 = new Bank("INDIAN", 8798348, 347882);
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	
	
	System.out.println("*****using iterator*********");
	Iterator<Bank> it = ts.iterator();
	while(it.hasNext()){
		Bank e = it.next();
		System.out.println("namme is"+e.name);
		System.out.println("number is"+e.mirc);
		System.out.println("pincode is "+e.pincode);
		System.out.println("================");
		
	}
	

	
}
}
