package com.ustglobal.stockmangment.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ustglobal.stockmangment.dto.Product_info;
import com.ustglobal.stockmangment.dto.Response;
import com.ustglobal.stockmangment.service.StockService;



@CrossOrigin(origins ="*", allowedHeaders = "*",allowCredentials="true")
@RestController
public class StockController {
	
	@Autowired
	private StockService service;
	
	@PostMapping(path="/add-item" , consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addproduct(@RequestBody Product_info info){
		Response respons = new Response();
		if(service.addproduct(info)){
			
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
	@PostMapping(path="/update" , consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response  updateproduct(@RequestBody Product_info info){
		Response respons = new Response();
		if(service.updateproduct(info)){
			
			respons.setStatusecode(201);
			respons.setMessge("success");
			respons.setDiscription("Data updated to the DB");
			}else{
				respons.setStatusecode(401);
				respons.setMessge("Failure");
				respons.setDiscription("Data not updated to the DB");
			 	
			}
		return respons;
		
	}
	
	@GetMapping(path="/get-name/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
	public  Response getByname(@RequestParam("name") String name ){
		Response respons = new Response();
		Product_info info = service.getByname(name);

		if(info!=null ){
			respons.setStatusecode(201);
			respons.setMessge("success");
			respons.setDiscription("Data name to the DB");
			}else{
				respons.setStatusecode(401);
				respons.setMessge("Failure");
				respons.setDiscription("Data not name to the DB");
			}
		return respons;
	
	}
	
	@GetMapping(path="/get-company",produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getByCompany(@RequestParam("company")String company){
		Response respons = new Response();
		Product_info info = service.getByCompany(company);
		if(info!=null ){
			respons.setStatusecode(201);
			respons.setMessge("success");
			respons.setDiscription("Data company to the DB");
			}else{
				respons.setStatusecode(401);
				respons.setMessge("Failure");
				respons.setDiscription("Data not company to the DB");
			}
		return respons;
	
	}
	
	
	@GetMapping(path="/get-category",produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getByCatogarty(@RequestParam("category")String category){
		
		Response respons = new Response();
		Product_info info = service.getByCatogarty(category);
		if(info!=null ){
			respons.setStatusecode(201);
			respons.setMessge("success");
			respons.setDiscription("Data category to the DB");
			}else{
				respons.setStatusecode(401);
				respons.setMessge("Failure");
				respons.setDiscription("Data not category to the DB");
			}
		return respons;
	
	}
	
	
	
	
	@GetMapping(path="/get-all",
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Response displayall(){
		Response response = new Response();
		List<Product_info> info = service.displayall();
		if(!info.isEmpty()) {
			response.setStatusecode(201);
			response.setMessge("Success");
			response.setDiscription("Books found in the DB");
			response.setProduct(info);
         }else {
        	 response.setStatusecode(401);
 			response.setMessge("Failure");
 			response.setDiscription("Books not found in the DB");
         }
		return response;
		
	}


}














