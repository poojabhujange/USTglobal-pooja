package com.ustglobal.springmvcassesment.dao;

import com.ustglobal.springmvcassesment.dto.ProductBean;

import com.ustglobal.springmvcassesment.dto.Custmar;


public interface CustmorDAO {
	public Custmar login(int id,String password);
	public int register(Custmar bean);
	public ProductBean searchProduct(int id);
	public boolean changePassword(int id,String password);
   
	public Custmar products(int id);
	//public Order orderProduct(Order order);
}
