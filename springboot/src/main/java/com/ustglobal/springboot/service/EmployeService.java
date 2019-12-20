package com.ustglobal.springboot.service;

import java.util.List;

import com.ustglobal.springboot.dto.EmployeBean;

public interface EmployeService {
	
	public boolean addEmployee(EmployeBean bean);
	public boolean mdifyEmployee(EmployeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeBean getEmployee(int id);
	public List<EmployeBean> getAllEmploye();

}
