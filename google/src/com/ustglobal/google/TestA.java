package com.ustglobal.google;

public class TestA {
	public static void main(String[] args) {
		Browser b = new Browser();
		Google g = new Gmail();
		b.open(g);
		Gmail g2 = (Gmail) g;
		b.open(g2);
		System.out.println("============");
		Google d = new GoogleDrive();
		b.open(d);
		GoogleDrive d1= (GoogleDrive)d;
		b.open(d1);
		
		
	}

}
