package com.ustglobal.strem.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestE {
	public static void main(String[] args) {
		ArrayList<Integer> marker = new ArrayList<>();
		marker.add(70);
		marker.add(25);
		marker.add(50);
		marker.add(35);
		marker.add(55);
		Comparator<Integer> cmp = (m1,m2)->{
		if(m1>m2){
			return 1;
			
		}else if(m1<m2){
			return -1;
			
		}else{
			return 0;
		}
	};
		
		long noOfFailedStudent=marker.stream().filter(i->i<40).count();
		System.out.println(noOfFailedStudent);
		System.out.println("==========================");
		Integer i=marker.stream().min(cmp).get();
		System.out.println(i);
		Integer j =marker.stream().max(cmp).get();
		System.out.println(j);

		
		
		
	}

}
