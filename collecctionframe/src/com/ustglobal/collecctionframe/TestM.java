package com.ustglobal.collecctionframe;

import java.util.List;
import java.util.ArrayList;

public class TestM {
public static void main(String[] args) {
	ArrayList<Double> al = new ArrayList<Double>();
	al.add(34.5);
	al.add(23.4);
	al.add(89.89);
	al.add(893.98);
	al.add(34.5);
	al.add(null);
	al.add(null);
	System.out.println(al);
	
	al.add(2,54.6);
	System.out.println("after add in 2nd index"+al);
	al.remove(0);
	System.out.println("after removing"+al);
	al.remove(null);
	System.out.println("after removing null"+al);
	Double val = al.get(4);
	System.out.println("object at 4th index"+val);
	al.set(2, 77.6);
	System.out.println("After the replacing"+al);
	al.clear();
	System.out.println("after clear "+al);
	al.contains(54.6);
	
	List<Double> al1= new ArrayList<>();
	al1.add(12.3);
	al1.add(23.4);
	al1.add(47.9);
	al.addAll(al1);
	System.out.println(al1);
	
	boolean Contain = al.containsAll(al1);
	System.out.println("Contgaints all"+Contain);
	
	boolean res = al.removeAll(al1);
	System.out.println("Remove all of al1"+res);
	
	
}
}
