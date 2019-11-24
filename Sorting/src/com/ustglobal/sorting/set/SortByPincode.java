package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		Integer s = o1.pincode;
		Integer p = o2.pincode;
		return s.compareTo(p);
		
	}
	
}
