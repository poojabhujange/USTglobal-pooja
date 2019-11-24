package com.ustglobal.strem.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {
	public static void main(String[] args) {
		  ArrayList<Integer> al = new ArrayList<>();
			al.add(20);
			al.add(23);
			al.add(5);
			al.add(12);
			al.add(50);
			List<Integer> l=al.stream().map(i ->i+50).collect(Collectors.toList());
			for(Integer i:l){
				System.out.println(i);
		}

}
}
