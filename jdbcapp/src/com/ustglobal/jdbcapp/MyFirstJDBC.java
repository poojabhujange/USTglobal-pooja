package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{//step 1
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
				
			//step 2
			String url="jdbc:mysql://localhost:3306/ust_ty_db?";
		    conn =DriverManager.getConnection(url,"root","root");//method overloading
		    
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
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		
	}//end of main();
	

}//end of myfirstjDBC
