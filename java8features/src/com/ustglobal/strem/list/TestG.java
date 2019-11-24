package com.ustglobal.strem.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestG {
	public static void main(String[] args) {
		
		ArrayList<Employe> al = new ArrayList<>();
		Employe e1 = new Employe(1, "yuraj");
		Employe e2 = new Employe(2, "yuvi");
		Employe e3 = new Employe(3, "yvika");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Comparator<Employe> cmp =(e4,e5)->{
			return e5.name.compareTo(e4.name);
		};
		List<Employe> l=al.stream().sorted(cmp).collect(Collectors.toList());
		Iterator<Employe> it = l.iterator();
		while(it.hasNext()){
			Employe e = it.next();
			System.out.println(""+e.id);
			System.out.println(""+e.name);
		}
		


	}

}
