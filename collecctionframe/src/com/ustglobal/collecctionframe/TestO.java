package com.ustglobal.collecctionframe;

import java.util.ArrayList;
import java.util.Collections;

public class TestO {
     public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("girija");
	al.add("vanaja");
	al.add("jalaja");
	al.add("Kiran");
	
	System.out.println("befor"+al);
	Collections.sort(al);
	System.out.println("After "+al);
	
	}
}
