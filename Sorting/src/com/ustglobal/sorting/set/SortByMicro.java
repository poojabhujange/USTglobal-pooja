package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByMicro  implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		Long p = o1.mirc;
		Long q=o2.mirc;
		return p.compareTo(q);
	}

}
