package com.ustglobal.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springboot.dto.EmployeBean;
import com.ustglobal.springboot.repo.EmployeeRepo;

@Service
public class EmployeeServiceJpaImpl implements EmployeService {

	@Autowired
	private EmployeeRepo repo;

	@Override
	public boolean addEmployee(EmployeBean bean) {
		repo.save(bean);

		return true;
	}

	@Override
	public boolean mdifyEmployee(EmployeBean bean) {
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getPassword());
		System.out.println(bean.getGender());
		System.out.println(bean.getDoj());
		repo.update(bean.getName(), bean.getPassword(), bean.getDoj(), bean.getGender(), bean.getId());
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// EmployeBean bean = repo.findById(id).get();
		// repo.delete(bean);
		repo.deleteById(id);
		return true;
	}

	@Override
	public EmployeBean getEmployee(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<EmployeBean> getAllEmploye() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
