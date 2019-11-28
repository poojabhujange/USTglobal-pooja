package com.ustgobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Auther {
	
	private String name;
	private String penname;	
	@Autowired
	private Book book;
	
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPenname() {
		return penname;
	}
	public void setPenname(String penname) {
		this.penname = penname;
	}
	
	

}
