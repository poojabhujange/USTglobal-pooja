package com.ustglobal.excepton.second;

public class TestA {
	 public static void main(String[] args) {
		 System.out.println("main started");
		 try{
	    	Thread.sleep(3000);//compile time error  
		 }
		 catch(InterruptedException e){
			 System.out.println("Exception caught");
			 e.printStackTrace();
		 }
		 System.out.println("main ended");
	}

}
