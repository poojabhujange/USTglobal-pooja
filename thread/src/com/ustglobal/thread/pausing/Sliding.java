package com.ustglobal.thread.pausing;

public class Sliding {
  public static void main(String[] args) {
	System.out.println("start");
	
	for (int i = 0; i < 5; i++) {
		System.out.println("sliding");
		
	}
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("end");
}
}
