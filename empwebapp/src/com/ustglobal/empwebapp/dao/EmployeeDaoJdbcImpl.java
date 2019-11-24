package com.ustglobal.empwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ustgobal.empwebapp.dto.EmployeeDB;

public class EmployeeDaoJdbcImpl   implements EmployeeDAO {

private static final String URL = "jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=root";
private static final String  DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";

private static final String SELECT_SQL ="select * from employee_db where id=?";
private static final String INSERT_SQL ="insert into employee_db values(?,?,?,?)";
private static final String UPDATE_SQL ="update employee_db set password=? where id=? ";


@Override
	public EmployeeDB auth(int id, String password) {
		//String sql = "select * from employee_db where id=? and password=?";
		
		EmployeeDB db = searchEmployee(id);
		if(db!=null){
			String pass = db.getPassword();
			if(pass.equals(password)){
				return db;
			}else{
				return null;
			}			
		}
		
		return null;
	}

	@Override
	public EmployeeDB searchEmployee(int id) {
      String sql = SELECT_SQL;
	    try{
	       	 Class.forName(DRIVER_CLASS_NAME);
	       	 try(Connection conn = DriverManager.getConnection(URL);
	       			 PreparedStatement pstmt = conn.prepareStatement(SELECT_SQL)){
	       		 
	       		pstmt.setInt(1, id);
	       		try(ResultSet rs = pstmt.executeQuery()){
	       			if(rs.next()){
	       				EmployeeDB db = new EmployeeDB();
	       				db.setId(rs.getInt("id"));
	       				db.setName(rs.getString("name"));
	       				db.setEmail(rs.getString("email"));
	       				db.setPassword(rs.getString("password"));
	       				
	       				
	       				return db;
	       			}else{
	       				return null;
	       			}
	       		}
	       	
	       	 }
		    }catch(Exception e){
		    	e.printStackTrace();
				return null;
		    }    	
	}

	@Override
	public boolean changePassword(int id, String password) {
	    String sql = UPDATE_SQL;
	    try{
       	 Class.forName(DRIVER_CLASS_NAME);
       	 try(Connection conn = DriverManager.getConnection(URL);
       		 PreparedStatement pstmt = conn.prepareStatement(UPDATE_SQL)){
       		 
       		pstmt.setString(1, password);
       		pstmt.setInt(2, id);
       		
       		int count = pstmt.executeUpdate();
       	if(count>0){
       		return true;
       	}else{
       		return false;
       	}
       		
       	//boolean check = count>0? true :false;
       	 //return check; we can use tarnary operator also
       	 
       	 }
	    }catch(Exception e){
	    	e.printStackTrace();
			return false;
	    }
	    
	}

	@Override
	public boolean registerEmployee(EmployeeDB db) {
         String sql = INSERT_SQL;

         try{
        	 Class.forName(DRIVER_CLASS_NAME);
        	 try(Connection conn = DriverManager.getConnection(URL);
        		 PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL)){
        		 pstmt.setInt(1, db.getId());
        		 pstmt.setString(2, db.getName());
        		 pstmt.setString(3, db.getEmail());
        		 pstmt.setString(4, db.getPassword());
        		 
        		 int count = pstmt.executeUpdate();
        		 if(count>0){
        			 return true;
        			 
        		 }else{
        			 return false;
        		 }
        		 
        	 }
         }catch(Exception e){
        	 e.printStackTrace();
        		return false;
         }
         

	
	}
	

}
