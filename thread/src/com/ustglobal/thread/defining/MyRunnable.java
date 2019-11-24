package com.ustglobal.thread.defining;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("child thread");
			// TODO Auto-generated method stub
		}
		
	}

	
	
}
//we cant creat object of myRunnbale cls which implemment runable.
//we create theobject of thread... pas the refrece varible to of the myrunnable class
//bcz by runnbale 