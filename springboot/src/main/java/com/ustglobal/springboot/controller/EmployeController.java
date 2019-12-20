package com.ustglobal.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springboot.dto.EmployeBean;
import com.ustglobal.springboot.dto.EmployeeResponse;
import com.ustglobal.springboot.service.EmployeService;

@RestController
public class EmployeController {
	
	@Autowired
	private EmployeService service;
	
	
	
	//no form for fill the data bcz we are not using view so clint showd send the data 
	@PostMapping(path="/add", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeBean bean){
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(bean)){
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to the DB");
		}else{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the DB");
		 	
		}
		return response;
	}//end of addEmployee
	
	@PutMapping(path="/modify", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse mdifyEmployee(@RequestBody EmployeBean bean){
		EmployeeResponse response = new EmployeeResponse();
		if(service.mdifyEmployee(bean)){
			
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDescription("data is modified");
		}else{
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("data is not modified");
		}
		return response;
	}//end of modifiEmployee
	
	
	// it consume id so no nead of json so we give with the path. to get path we use path variable
	@DeleteMapping(path="/delete/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmplre(@PathVariable("id") int id){	
		EmployeeResponse response = new EmployeeResponse();
		if(service.deleteEmployee(id)){
			
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDescription("data is deleted");
		}else{
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("data is not deleted");
		}		
		return response;
	}//end of deletEmployee
	
	@GetMapping(path = "/get",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id")int id){
		EmployeeResponse response = new EmployeeResponse();
		EmployeBean bean  = service.getEmployee(id);
		if(bean!=null){
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDescription("data is found in DB");
			response.setEmployeBeans(Arrays.asList(bean));
			
		}else{
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("data is not found in DB ");
			
		}
		

		return response;

	}//end of getEmployee
	
	@GetMapping(path = "/get-all",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmploye(){
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeBean> beans  = service.getAllEmploye();
		if(!beans.isEmpty()){
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDescription("data is found in DB");
			response.setEmployeBeans(beans);
			
		}else{
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("data is not found in DB ");
			
		}
		

		return response;

	}//end of getallEmployee
	
	@GetMapping(path ="/exce",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void CreateException(){
		int i = 1/0;
	}
	
	
	
	
	
	

}
