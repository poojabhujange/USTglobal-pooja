package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue<>();
		pq.add(12);
		pq.add(24);
	//	pq.add("hello");
	//	pq.add(null);
		pq.offer(1);//we can add by this method
		System.out.println("********8using Iterator********");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()){
			System.out.println(pq.poll());
		}
        System.out.println("After poll"+pq);
	}

}
