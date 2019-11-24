package com.ustglobal.maps;
import java.util.Map;
import java.util.TreeMap;

public class Tree {
	public static void main(String[] args) {
		
	TreeMap<String, Integer> lh = new TreeMap<>();
	lh.put("Banglore", 560068);
	lh.put("pune", 77788);
	lh.put("bidar", 585401);
  //  lh.put(null, 6787999);
	
	for(Map.Entry<String,Integer> m:lh.entrySet()){
		String key = m.getKey();
		Integer value = m.getValue();
		System.out.println(key);
		System.out.println(value);
		
		
	}
	}
}
