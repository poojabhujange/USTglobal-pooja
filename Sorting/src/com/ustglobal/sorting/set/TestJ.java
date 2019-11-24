package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
     public static void main(String[] args) {
    	 SortByNam sm = new SortByNam();
    		TreeSet<Customer> ts = new TreeSet<Customer>(sm);
    		Customer c1 = new Customer("pooja", 122, 50900);
    		Customer c2 = new Customer("pari", 123, 5900);
    		Customer c3 = new Customer("mahesh", 125, 46900);
    		Customer c4 = new Customer("pehu", 127, 89900);
    		Customer c5 = new Customer("pehu", 127, 89900);

    		
    		ts.add(c1);
    		ts.add(c2);
    		ts.add(c3);
    		ts.add(c4);
    		ts.add(c5);
    		System.out.println("*****using iterator*********");
    		Iterator<Customer> it = ts.iterator();
    		while(it.hasNext()){
    			Customer e = it.next();
    			System.out.println("name is"+e.name);
    			System.out.println("id is"+e.id);
    			System.out.println("salary is "+e.salary);
    			System.out.println("================");
    			
    		}

    		
    		

	}
}
