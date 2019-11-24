package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExcecuteDeleteQuery {
public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	try{

		
		//Driver driver=new Driver();
		//DriverManager.registerDriver(driver);
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?";
		conn = DriverManager.getConnection(url,"root","root");
		
		String sql ="delete from employee_info where id=6";
		stmt=conn.createStatement();
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
	
}//end


