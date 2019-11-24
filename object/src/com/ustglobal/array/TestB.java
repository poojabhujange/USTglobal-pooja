package com.ustglobal.array;

public class TestB {
	public static void main(String[] args) {
		
		String[] st ={ "pooja","pari","pallavi" };
		//System.out.println(nums[10]);//arrayout ofbound exception
		receive(st);
		
	 String[] values =getArray();
	 for(String val :values){
		 System.out.println(val);
	 }
	}

	 static void receive(String[] string) {
	  for(String st1 : string){
		System.out.println(st1);
	    }
	 }
	 static String[] getArray(){
		 String[] values ={"pooja","pallavi","pari"};
		 return values;
	 }
	 
	 }



