package com.ustglobal.excepton.customchecked;

public class TestAmount {
	public static void main(String[] args) {
		System.out.println("started");
		ValidateAmount va = new ValidateAmount();
		try {
			va.checkAmount(200000);
			System.out.println("withdraw your amount");
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			System.err.println(e.getMessage());
		}
		
		System.out.println("ended");
	}

}
