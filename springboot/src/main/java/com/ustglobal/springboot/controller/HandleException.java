package com.ustglobal.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springboot.dto.EmployeeResponse;

//@ControllerAdvice// it use to handle the exception in sprngmvc @ResponseBody+ControllerAdvice= @RestControllerAdvice
@RestControllerAdvice
public class HandleException {
	
	@ExceptionHandler(Exception.class)
	public  EmployeeResponse getException(Exception e){
		e.printStackTrace();
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Error in code");
		response.setDescription("Get Exception");
		return response;
		
	}
}