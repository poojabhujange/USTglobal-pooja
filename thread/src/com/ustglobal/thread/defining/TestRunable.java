package com.ustglobal.thread.defining;

public class TestRunable {

	
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread();
		t.start();
		
		for(int i = 0 ;i<10;i++){
			System.out.println("main thread-[=");
		}
		
	}
}
//why to way to creat thread?
//we shuld implement the runbale interface there is possiblete of extend other cls.