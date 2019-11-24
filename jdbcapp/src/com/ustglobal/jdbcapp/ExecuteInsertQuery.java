package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
    public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		try{
			
			//step1 Load the Driver
			//Driver driver=new Driver();//we can throw exception from costrucor
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 get connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?";
			conn = DriverManager.getConnection(url,"root","root");
			
			//step 3 Issue Sql query
			String sql = "insert into employee_info values(?,?,?,?)";
			//stmt = conn.createStatement();
			//int count = stmt.executeUpdate(sql);//object of the type integerst
			
			pstmt=conn.prepareStatement(sql);
			String empid =args[0];
			int id =Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsalary =args[2];
			int salary =Integer.parseInt(empsalary);
			pstmt.setInt(3,salary);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			
			
			
			//step 4 read the result
			System.out.println(count + " Row(s) Inserted");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(conn!=null){
				conn.close();
				}if(pstmt!=null){
					pstmt.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		
	}//end
}
