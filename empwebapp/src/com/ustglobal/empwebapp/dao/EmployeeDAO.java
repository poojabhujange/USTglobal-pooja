package com.ustglobal.empwebapp.dao;

import com.ustgobal.empwebapp.dto.EmployeeDB;

public interface EmployeeDAO {
	
	public EmployeeDB auth(int id,String password);// 4 operation are database operation 
	
	public EmployeeDB searchEmployee(int id);
	
	public boolean changePassword(int id, String password);
	
	public boolean registerEmployee(EmployeeDB db);
	

}
