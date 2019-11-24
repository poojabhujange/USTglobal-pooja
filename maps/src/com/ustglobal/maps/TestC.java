package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		lh.put("Banglore", 560068);
		lh.put("pune", 77788);
		lh.put("bidar", 585401);
		
		System.out.println(lh);
		Set<String> s = lh.keySet();
		
	   for(String key:s){
		   System.out.println("key"+key);
	   }
	   
	   Collection<Integer> c = lh.values();
	   
	   for(Integer value : c){
		   
	   }
	   
	}

}
