package com.ustglobal.stockmangment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmangment.dao.StockDAO;
import com.ustglobal.stockmangment.dto.Product_info;

@Service
public class StockServiceImpl  implements StockService{
	
	@Autowired
	private StockDAO dao; 

	@Override
	public boolean addproduct(Product_info info) {
		if(info.getName()==null || info.getCompany()==null){
			return false;
			}	
		return dao.addproduct(info);
	}

	@Override
	public boolean updateproduct(Product_info info) {
		if(info.getName()==null || info.getCompany()==null){
			return false;
			}
		return dao.updateproduct(info);
	}

	@Override
	public Product_info getByname(String name) {
	
		
		return dao.getByname(name);
	}

	@Override
	public Product_info getByCompany(String company) {
		// TODO Auto-generated method stub
		return dao.getByCompany(company);
	}

	@Override
	public Product_info getByCatogarty(String category) {
		// TODO Auto-generated method stub
		return dao.getByCatogarty(category);
	}

	@Override
	public List<Product_info> displayall() {
		// TODO Auto-generated method stub
		return dao.displayall();
	}
	

}
