package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
public static void main(String[] args) {
	Hashtable<Integer,String> ht = new Hashtable<>();
	ht.put(101, "ajay");
	ht.put(102, "vijay");
	ht.put(100, "sonu");
	ht.put(99, "monu");
	ht.put(101,"siram");
//	ht.put(null, "john");//null pointer exception
//	ht.put(105, "null");//no null for key value
System.out.println("Data"+ht);

	
}
}
