package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJdbcwithProperties {
	public static void main(String[] args) {
		
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	FileReader reader = null;
	
	try{
		reader = new FileReader("db.properties");
		Properties pro = new Properties();
		pro.load(reader);
		
		
		//step 1 load the drive
		Class.forName("com.mysql.jdbc.Driver");
			
		//step 2 get connection
		String url=pro.getProperty("url");
	    conn =DriverManager.getConnection(url,pro);
	    
	    //step 3 issue the sql query
	    stmt=conn.createStatement();
	    String sql ="select * from Employee_Info";
	    rs=stmt.executeQuery(sql);
	    
	    //step 4 read the result
	    while(rs.next()){
	    	int id = rs.getInt("id");
	    	String name=rs.getString("name");
	         int salary = rs.getInt("salary") ;
	         String gender = rs.getString("gender");
	         
	         System.out.println("id is"+id);
	         System.out.println("name is"+name);
	         System.out.println("salary is"+salary);
	         System.out.println("gender is "+gender);
	         System.out.println("*************");
	         }
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(conn!=null){
				conn.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(rs!=null){
				rs.close();
			}if(reader!=null){
				reader.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}//end of main();


}//end of myfirstjDBC

