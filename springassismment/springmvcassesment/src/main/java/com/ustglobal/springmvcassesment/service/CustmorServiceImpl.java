package com.ustglobal.springmvcassesment.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ustglobal.springmvcassesment.dao.CustmorDAO;
import com.ustglobal.springmvcassesment.dto.ProductBean;
import com.ustglobal.springmvcassesment.dto.Custmar;

@Service
public class CustmorServiceImpl implements CustmorService {

	@Autowired
	private CustmorDAO dao;
	
	@Override
	public Custmar login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int register(Custmar bean) {
		return dao.register(bean);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id, password);
	}

	public ProductBean searchProduct(int id) {
		return dao.searchProduct(id);
	}

//	@Override
//	public Order orderProduct(Order order) {
//		// TODO Auto-generated method stub
//		return dao.orderProduct(order);
//	}
}
