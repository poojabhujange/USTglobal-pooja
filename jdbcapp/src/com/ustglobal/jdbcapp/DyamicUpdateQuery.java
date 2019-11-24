package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class DyamicUpdateQuery {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?";
			conn = DriverManager.getConnection(url,"root","root");
			
			String sql = "update employee_info set name =?,salary=?,gender=? where id=?";
			pstmt =conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			
			String empsalary = args[2];
			int salary = Integer.parseInt(empsalary);
			
			String gender = args[3];
			
	
			pstmt.setInt(4, id);
			pstmt.setString(1,name);
			pstmt.setString(3, gender);
			pstmt.setInt(2, salary);

			int count = pstmt.executeUpdate();
			System.out.println(count +" row(s) upadte");
		}catch(SQLException e){
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
	}

}
