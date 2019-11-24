package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyDeleteProperties {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		FileReader reader = null;
		
		try{
			reader = new FileReader("db.properties");
			Properties pro = new Properties();
			pro.load(reader);
		
			Class.forName(pro.getProperty("driver-class-name"));
			
			//step 2 get connection
			String url=pro.getProperty("url");
		    conn =DriverManager.getConnection(url,pro);
		    
		    //step 3 issue the sql query
		    stmt=conn.createStatement();
		    String sql =pro.getProperty("delete-query");
		    int count = stmt.executeUpdate(sql);
		    
		    
			System.out.println(count +"Row is delete");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(conn!=null){
					conn.close();
					
					
				}if(stmt!=null){
					stmt.close();
				}
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
}

