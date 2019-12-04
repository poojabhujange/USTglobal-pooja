package com.ustglobal.springrest.dao;

import java.util.List;

import com.ustglobal.springrest.dto.EmployeBean;



public interface EmployeeDAO {
	public boolean addEmployee(EmployeBean bean);
	public boolean mdifyEmployee(EmployeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeBean getEmployee(int id);
	public List<EmployeBean> getAllEmploye();
	

}
