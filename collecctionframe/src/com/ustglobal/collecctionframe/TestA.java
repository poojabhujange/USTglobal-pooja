package com.ustglobal.collecctionframe;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
	
		a1.add(12);
		a1.add(22.3);
		a1.add("pooja");
		a1.add(true);
		a1.add(null);
		a1.add('s');
		
		Object o = a1.get(2);
		System.out.println(o);
		
		for(int i =0;i<6;i++){
			Object obj =a1.get(i);
			System.out.println(obj);
	}
	}
}


