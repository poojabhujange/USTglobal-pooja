package com.ustglobal.singlton;

public class MySingalton {
  private static MySingalton instance = null;	
  String s;
  private MySingalton(){
	  
  }//private bcz other cls not called
  public static MySingalton getDbConnection(){
	  if(instance==null){
		  instance = new MySingalton();
		  return instance;
	  }else{
		  return instance;
	  }
  }
}
