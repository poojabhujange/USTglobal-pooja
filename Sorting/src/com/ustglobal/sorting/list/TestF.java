package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestF {
	
	public static void main(String[] args) {
		ArrayList<Marker> am= new  ArrayList<>();
		am.add(new Marker("red",50));
		am.add(new Marker("blue",40));
		am.add(new Marker("pink",20));
		am.add(new Marker("black",30));
		display(am);
		
		SortByPrice sb = new SortByPrice();
		//Collections.sort(am,sb);
		
		System.out.println("---------->");
		display(am);
		
		System.out.println("=======================");
		SortByColor sc1 = new SortByColor();
		Collections.sort(am,sc1);
		display(am);
	}
	static void display(ArrayList<Marker> m){
		Iterator<Marker> it=m.iterator();
		while(it.hasNext()){
			Marker m1 = it.next();
			System.out.println("Brand is "+m1.color);
			System.out.println("Price is "+m1.price);
			System.out.println("==========");
		}

		
				
	}
	

}
