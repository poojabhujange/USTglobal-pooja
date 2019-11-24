package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestO {
	public static void main(String[] args) {
		
		Comparator<Employe1> comp = (e1,e2)->{
			return e1.name.compareTo(e2.name);
		};
		TreeSet<Employe1> ts = new TreeSet<Employe1>(comp);
		Employe1 e1 = new Employe1(11, "pooja", 5.6);
		Employe1 e2 = new Employe1(12, "baskar", 5.3);
		Employe1 e3 = new Employe1(14, "sushan", 5.8);
		Employe1 e4 = new Employe1(15, "dinesh", 5.5);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		Iterator<Employe1> it= ts.iterator();
		while(it.hasNext()){
			Employe1 e = it.next();
			System.out.println("name is"+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("heigh is"+e.height);
			System.out.println("=======================");
		}

	}

}
