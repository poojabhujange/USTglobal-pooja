package com.ustglobal.thread.defining;

public class MyTread extends Thread {
 
	public void run(){
		for(int i =0;i<10;i++){
			System.out.println("child thread");
		}
	}
	
/*//	public void start(){
//		System.out.println("start method ovrried");
//	}if it overrie it behave like normal
//	ctrl +shift + /		
*/
	
}
