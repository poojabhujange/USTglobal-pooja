package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
  public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku", 998714);
		hm.put("mala", 788989);
		hm.put(null, 98798);
		
		HashMap hm1 = new HashMap();
		hm1.put("kuku", 998714);
		hm1.put("mala", 788989);
		hm1.put(null, 98798);
		
		boolean haskey = hm.containsKey("mala");
		System.out.println(haskey);
		
		
		boolean hasValue = hm.containsKey("567877");
		System.out.println(hasValue);
		
		hm.putAll(hm1);
		System.out.println(hm);
		System.out.println(hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println(isEmpty);
		hm.clear();
		
		

}
}
