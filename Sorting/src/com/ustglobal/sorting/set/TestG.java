package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {
	public static void main(String[]args){
		HashSet<Employe> hs = new HashSet<>();
		Employe e1= new Employe(12, "sweeta", 45000);
		Employe e2 = new Employe(11, "teja", 50000);
		Employe e3 = new Employe(4, "giri", 10000);
		Employe e4 = new Employe(3, "pooja", 678900);
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		
		//equal and boolen method overried if we dont want to allow dublicat
		
		
		System.out.println("*****using iterator*********");
		Iterator<Employe> it = hs.iterator();
		while(it.hasNext()){
			Employe e = it.next();
			System.out.println("id is"+e.id);
			System.out.println("name is"+e.name);
			System.out.println("salary is "+e.salary);
			
		}
		
		
		
		
		
	}

}
