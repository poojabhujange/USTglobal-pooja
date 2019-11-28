package com.ustgobal.springcore.di;


public class Book {
	
	private Auther auther;
	private String name;
	private int price;

	public Auther getAuther() {
		return auther;
	}
	public void setAuther(Auther auther) {
		this.auther = auther;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
/*	
//	@PostConstruct
	public void init() {
     System.out.println("data start");
	}
	//@PreDestroy
	public void destroy() {
		
     System.out.println("data is distroy");
	}
	
*/
}
