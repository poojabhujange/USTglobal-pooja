package com.ustglobal.stockmangment.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.ustglobal.stockmangment.dto.Product_info;

public interface StockDAO {
	
	public boolean addproduct(Product_info info);
	public boolean updateproduct(Product_info info);
	public  Product_info getByname(String name);
	public Product_info getByCompany(String company);
	public Product_info getByCatogarty(String category);
	public List<Product_info> displayall();
	
	
	

}
