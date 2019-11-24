package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku", 998714);
		hm.put("mala", 788989);
		hm.put(null, 98798);
		hm.put(null, 98798);
	

		
		
		System.out.println("data "+hm);
		hm.put("mala", 999);
		System.out.println("after modify"+hm);
		hm.put("dimple", 999);
		System.out.println(hm);
		
		Object phoneno1 = hm.get("she");
		System.out.println(phoneno1);
		
		Object value= hm.remove("kuku");
		System.out.println(value);
		
		

				
	}

}
