package com.ustglobal.strem.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
public static void main(String[] args) {
	ArrayList<Integer> marker = new ArrayList<>();
	marker.add(70);
	marker.add(25);
	marker.add(50);
	marker.add(35);
	marker.add(55);
	List<Integer> l=
	marker.stream().sorted().collect(Collectors.toList());
	Iterator<Integer> it = l.iterator();
	while(it.hasNext()){
		Integer i = it.next();
		System.out.println("Sorted--------->");
		System.out.println(i);
	
	}
	
}
}
