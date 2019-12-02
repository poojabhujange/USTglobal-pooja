package com.ustglobal.springmvcassesment.service;

import com.ustglobal.springmvcassesment.dto.ProductBean;
import com.ustglobal.springmvcassesment.dto.Custmar;

public interface CustmorService {
	public Custmar login(int id,String password);
	public int register(Custmar bean);
	public boolean changePassword(int id,String password);
	public ProductBean searchProduct(String name);
}
