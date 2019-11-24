package com.ustglobal.atmmmachin;

public class TestA {

	public static void main(String[] args) {
		Machine m = new Machine();
		
		HDFC h = new HDFC();
		m.slot(h);
		
		ICICI c = new ICICI();
		m.slot(c);
		
		SBI s =  new SBI();
		m.slot(s);

	}

}
