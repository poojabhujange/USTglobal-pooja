package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		lh.put("Banglore", 560068);
		lh.put("pune", 77788);
		lh.put("bidar", 585401);
		for(Map.Entry<String,Integer> m:lh.entrySet()){
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key "+key+"----"+"value"+value);
			System.out.println("========");
			
		}
	}

}
