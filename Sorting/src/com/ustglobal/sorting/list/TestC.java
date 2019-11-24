package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(25);
		
		Integer pollElement = l.poll();
		System.out.println("peek Element"+pollElement);
        Integer pollFirstElement =l.pollFirst();
        System.out.println("peek first element"+pollElement);
        Integer pollLastElement = l.pollLast();
        System.out.println("poll Last Element"+pollLastElement);
        System.out.println("After poll-------->"+l);
        
        l.push(12);
        System.out.println("After push"+l);
        Integer p =l.pop();
        System.out.println(p);
        System.out.println("After pop---------->"+l);
            
	}

}
