package com.ustglobal.beanclass.pkg1;

public class TestA {
	public static void main(String[] args) {
		Employe e = new Employe();
		e.setId(12);
		e.setName("pooja");
		e.setDept("compoter science");
		e.setDesignation("hr");
		e.setSalary(563888);
		Database d = new Database();
		
		d.recive(e);
		
	}

}
