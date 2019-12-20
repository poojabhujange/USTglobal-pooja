package com.ustglobal.stockmangment.dto;

import java.util.List;


public class Response {

	private int statusecode;
	private String messge;
	private String discription;
	
	private List<Product_info> product;
	
	private List<Order> odrder;

	public int getStatusecode() {
		return statusecode;
	}

	public void setStatusecode(int statusecode) {
		this.statusecode = statusecode;
	}

	public String getMessge() {
		return messge;
	}

	public void setMessge(String messge) {
		this.messge = messge;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public List<Product_info> getProduct() {
		return product;
	}

	public void setProduct(List<Product_info> product) {
		this.product = product;
	}

	public List<Order> getOdrder() {
		return odrder;
	}

	public void setOdrder(List<Order> odrder) {
		this.odrder = odrder;
	}
	

}
