package com.ustglobal.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springboot.dao.EmployeeDAO;
import com.ustglobal.springboot.dto.EmployeBean;

//@Service
public class EmployeServiceImpl  implements EmployeService{
    // @Autowired
	private EmployeeDAO dao;
	
	@Override
	public boolean addEmployee(EmployeBean bean) {
		
		if(bean.getName()==null||bean.getPassword()==null){
			return false;
		}else if(bean.getPassword().length()<8){
			return false;
		}
		return dao.addEmployee(bean);
	}

	@Override
	public boolean mdifyEmployee(EmployeBean bean) {

		if(bean.getName()==null||bean.getPassword()==null){
			return false;
		}else if(bean.getPassword().length()<8){
			return false;
		}
		
		
		return dao.mdifyEmployee(bean);
	}

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeBean getEmployee(int id) {
		
		return dao.getEmployee(id);
	}

	@Override
	public List<EmployeBean> getAllEmploye() {
		return dao.getAllEmploye();
	}

}
