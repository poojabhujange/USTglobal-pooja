package com.ustgobal.employe.dto;

import java.sql.*;

import com.mysql.jdbc.Driver;


	public class DyanamicSelectQuery {
	 public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?";
		String sql="select * from employee_info where id=?";
		
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			
			conn = DriverManager.getConnection(url,"root","root");
			
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			rs =pstmt.executeQuery();
			
			if(rs.next()){
				int emp_id = rs.getInt("id");
				int salary =rs.getInt("salary");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				System.out.println("Id: "+emp_id);
				System.out.println("name: "+name);
				System.out.println("Salary: "+salary );
				System.out.println("Gender: "+gender);
				System.out.println("************************");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(conn!=null){
					conn.close();
					
					
				}if(pstmt!=null){
					pstmt.close();
				}if(rs!=null){
					rs.close();
				}
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		
	}//end
	}
