package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestE {
    public static void main(String[] args) {
    	ArrayList<Pen> p = new ArrayList<>();
		Pen p1 = new Pen(20, "penpoint");
		Pen p2 = new Pen(10, "founten");
		Pen p3 = new Pen(30, "penblack");
		Pen p4 = new Pen(40, "ballpen");
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		displayPenDetails(p);
		Collections.sort(p);
		System.out.println("========");
		displayPenDetails(p);
    }
		
    static void displayPenDetails(ArrayList<Pen> a){
			
    	Iterator<Pen> it=a.iterator();
			while(it.hasNext()){
				Pen pn = it.next();
				System.out.println("Brand is "+pn.brand);
				System.out.println("Price is "+pn.price);
				System.out.println("==========");
			}
			
		
	}
}
