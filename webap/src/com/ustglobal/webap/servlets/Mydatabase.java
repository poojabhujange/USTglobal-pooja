package com.ustglobal.webap.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mydatabase {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/ust_ty_db?";
		    conn =DriverManager.getConnection(url,"root","root");//method overloading
		    stmt=conn.createStatement();
		    String sql ="select * from Employee_Info";
		    rs=stmt.executeQuery(sql);
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
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		
	}//end of main();
	


}
