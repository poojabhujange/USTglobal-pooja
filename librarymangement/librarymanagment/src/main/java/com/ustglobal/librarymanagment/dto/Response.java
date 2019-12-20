package com.ustglobal.librarymanagment.dto;

import java.util.List;

import lombok.Data;


@Data
public class Response {

	private int statusecode;
	private String messge;
	private String discription;
	
	private List<User> Userb;
	
	private List<Book> bookb;
	

}
