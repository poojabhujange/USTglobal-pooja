package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class myinsetProperties {
	public static void main(String[] args) {
		
		
		Connection conn = null;
		ResultSet rs = null;
		FileReader reader = null;
		Statement stmt = null;
     try{
			
    	 reader = new FileReader("db.properties");
 		Properties pro = new Properties();
 		pro.load(reader);
			
			Class.forName(pro.getProperty("driver-class-name"));
			
			//step 2 get connection
			String url=pro.getProperty("url");
		    conn =DriverManager.getConnection(url,pro);
		    
			//step 3 Issue Sql query
			String sql = pro.getProperty("insert-query");
			stmt=conn.createStatement();
			
			int count = stmt.executeUpdate(sql);
			
			//step 4 read the result
			System.out.println(count + " Row(s) Inserted");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(conn!=null){
				conn.close();
				}if(stmt!=null){
				  stmt.close();
				}if(reader!=null){
					reader.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
	}//end
}
