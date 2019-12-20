package com.ustglobal.stockmangment.dao;

import com.ustglobal.stockmangment.dto.Order;
import com.ustglobal.stockmangment.dto.Product_info;

public interface CardDAO {
	
	public boolean addToCard(int id,int orde_id,double price);
	
	public Order OrderItems(); 
	

}
