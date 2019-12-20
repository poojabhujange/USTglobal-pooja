package com.ustglobal.stockmangment.service;

import com.ustglobal.stockmangment.dto.Order;

public interface Cardservice {

	public boolean addToCard(int id,int orde_id,double price);
	
	public Order OrderItems(); 
	

}
