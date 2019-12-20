package com.ustglobal.stockmangment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmangment.dao.CardDAO;
import com.ustglobal.stockmangment.dto.Order;


@Service
public class cardServiceimpl implements Cardservice{

	@Autowired
	private CardDAO dao;
	
	@Override
	public boolean addToCard(int id, int orde_id, double price) {
		

		return dao.addToCard(id, orde_id, price);
	}

	@Override
	public Order OrderItems() {

		return dao.OrderItems();
	}

}
