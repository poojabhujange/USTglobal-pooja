package com.ustglobal.thread.defining;

public class TestTread {
public static void main(String[] args) {
	System.out.println("started main");
	MyTread t1= new MyTread();
	t1.start();
	//t1.start();//we cant call two time star methode we will get illegeal exception
    for(int i =0;i<10;i++){
    	System.out.println("main thread");
    }
    System.out.println("main end");

}
}
