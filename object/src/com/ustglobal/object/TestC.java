package com.ustglobal.object;

public class TestC {
	public static void main(String[] args) {
		Employe e1 = new Employe(1,"pooja",50000);
		Employe e2 = new Employe(2,"poojapatil",60000);
        Employe e3 = new Employe(1,"pooja",50000);
        Employe e4=e3;
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));

        System.out.println(e3.equals(e4));


	}

}
