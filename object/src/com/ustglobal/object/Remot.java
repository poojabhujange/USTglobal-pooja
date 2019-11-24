package com.ustglobal.object;

public class Remot {
	void add(){
		System.out.println("add method");
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Remot r = new Remot();
		Class c = r.getClass();
		Object o= c.newInstance();
		Remot q= (Remot)o;
		q.add();
		
	}

}
