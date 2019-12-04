package com.ustglobal.empspringmvc.service;

import com.ustglobal.empspringmvc.dto.EmployeeBean;

public interface EmployeeService {                          // this is bcz to compare the data in back end    
	public EmployeeBean login(int id,String password);
	public int register(EmployeeBean bean);
	public boolean deletEmployee(int id);
	public EmployeeBean searchEmployee(int id);
	public boolean updateEmployee(EmployeeBean bean);
	public boolean changePassword(int id, String password);
	


}
