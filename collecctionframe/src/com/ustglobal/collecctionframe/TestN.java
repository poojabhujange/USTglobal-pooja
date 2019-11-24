package com.ustglobal.collecctionframe;

import java.util.Collections;
import java.util.LinkedList;


public class TestN {
	
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(12);
		l.add(13);
		l.add(34);
		l.add(3);
		l.add(10);
		System.out.println("Before sort"+l);
		Collections.sort(l);//we shoud pas only genaric type
		System.out.println("After sort"+l);
		Collections.reverse(l);
		System.out.println("after reverce"+l);
		Collections.shuffle(l);
		System.out.println("shuffle"+l);
		
	}

}
