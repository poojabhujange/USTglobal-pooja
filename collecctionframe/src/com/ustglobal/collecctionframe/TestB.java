package com.ustglobal.collecctionframe;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		
		a1.add(12);
		a1.add(22.3);
		a1.add("pooja");
		a1.add(true);
		a1.add(null);
	 
		for(Object o:a1){
			System.out.println(o);
		}
	}

}
