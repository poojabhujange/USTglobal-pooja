package com.ustglobal.stockmangment.controller;

import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmangment.dto.Order;
import com.ustglobal.stockmangment.dto.Product_info;
import com.ustglobal.stockmangment.dto.Response;
import com.ustglobal.stockmangment.service.Cardservice;

@RestController
public class CardController {
	
	@Autowired
	private Cardservice service;
	
	@PostMapping(path="/addtocard" , consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
public Response addToCard(int id,int orde_id,double price){
		Response respons = new Response();
		if(service.addToCard(id, orde_id, price)){
			
			respons.setStatusecode(201);
			respons.setMessge("success");
			respons.setDiscription("Data added to the DB");
			
			}else{
				respons.setStatusecode(401);
				respons.setMessge("Failure");
				respons.setDiscription("Data not added to the DB");
			 	
			}
		return respons;
			
	}
	

	@GetMapping(path="orderdata ",produces = MediaType.APPLICATION_JSON_VALUE)
	public Response OrderItems(){
		Response res = new Response();
		 Order order1= service.OrderItems();
		 if(order1!=null){
				res.setStatusecode(201);
				res.setMessge("success");
				res.setDiscription("Data added to the DB");
		 }else{
			 res.setStatusecode(401);
			 res.setMessge("Failure");
			res.setDiscription("Data not added to the DB");
			 	
			 
		 }
		return res;
		
		
	}
		
	
	
}
