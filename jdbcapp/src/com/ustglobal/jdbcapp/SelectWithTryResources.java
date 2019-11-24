package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectWithTryResources {
	public static void main(String[] args) {
		try(FileReader reader=new FileReader("db.properties")){
		     Properties pro = new Properties();
			 pro.load(reader);
			Class.forName(pro.getProperty("driver-class-name"));
			String url=pro.getProperty("url");
		    String sql =pro.getProperty("select-query");
              try(Connection conn=DriverManager.getConnection(url,pro);
	               Statement stmt = conn.createStatement();
	               ResultSet rs = stmt.executeQuery(sql)){
	            	   while(rs.next()){
	            		   System.out.println("id is"+rs.getInt("id"));
	      		         System.out.println("name is"+rs.getString("name"));
	      		         System.out.println("salary is"+rs.getInt("salary"));
	      		         System.out.println("gender is "+rs.getString("gender"));
	      		         System.out.println("*************");
	            	   }
	               }
                }catch(Exception e){
                	e.printStackTrace();
                }
                	
              
	    
}
}
