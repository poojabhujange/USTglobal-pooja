package com.ustglobal.librarymanagment.controller;

import java.util.Arrays;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagment.dto.Book;
import com.ustglobal.librarymanagment.dto.Order;
import com.ustglobal.librarymanagment.dto.Response;
import com.ustglobal.librarymanagment.dto.User;
import com.ustglobal.librarymanagment.service.LibraryService;

@CrossOrigin(origins ="*", allowedHeaders = "*",allowCredentials="true")
@RestController
public class libraryController {
	
	@Autowired
	private LibraryService service;
	
	@PostMapping(path="/register", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response register(@RequestBody User user){
		Response r = new Response();
		if(service.register(user)!=null){
			r.setStatusecode(201);
			r.setMessge("Sucess");
			r.setDiscription("data is  added");
		} else{
			r.setStatusecode(401);
			r.setMessge("fail");
			r.setDiscription("data is not added");
		}
		return r;
	}
	
	@PostMapping(path = "/login",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response login(@RequestBody User user){
		Response respo = new Response();
	User user1 =service.login(user.getEmail(), user.getPassword());
		if(user1!=null){
			respo.setStatusecode(201);
			respo.setMessge("sucess");
			respo.setDiscription("you r succesfully login");	
		}else{
			respo.setStatusecode(401);
			respo.setMessge("failed");
			respo.setDiscription("your not login");
		}
		return respo;
		
	}
	
	
	@DeleteMapping(path="/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response deleteUser(@PathVariable("id")  int id ){
		Response respon = new Response();
		if(service.deleteUser(id)){
			respon.setStatusecode(201);
			respon.setMessge("Sucess");
			respon.setDiscription("you have deleted");
		}else{
			respon.setStatusecode(401);
			respon.setMessge("failed");
			respon.setDiscription("data is deleted");
		}
		return respon;
}
	
	
	@PostMapping(path="/addbook",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Response addBok(@RequestBody Book book){
		Response resp = new Response();
		if(service.addBook(book)!=null){
			resp.setStatusecode(201);
			resp.setMessge("sucess");
			resp.setDiscription("book is added");
		}else{
			resp.setStatusecode(401);
			resp.setMessge("fail");
			resp.setDiscription("book is not added");
		}
		return resp;  
		
}
	@DeleteMapping(path="/deletebook/{book_id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response deleteBook(@PathVariable("book_id") int book_id) {
		Response response = new Response();
		
		if(service.deletBook(book_id)) {
			response.setStatusecode(201);
			response.setMessge("Success");
			response.setDiscription("Book deleted from the DB");
			
		}else {
			response.setStatusecode(401);
			response.setMessge("Failure");
			response.setDiscription("Book not deleted from the DB");
			
		}
		return response;	
	}
	
	
	@GetMapping(path="/get-all",
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Response displayAllBooks(){
		Response response = new Response();
		List<Book> books = service.displayAllBook();
		if(!books.isEmpty()) {
			response.setStatusecode(201);
			response.setMessge("Success");
			response.setDiscription("Books found in the DB");
			response.setBookb(books);
         }else {
        	 response.setStatusecode(401);
 			response.setMessge("Failure");
 			response.setDiscription("Books not found in the DB");
         }
		return response;
		
	}

	
	@GetMapping(path="/get-book/{name}",
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Response searchBook(@RequestParam("name") String name) {
		Response response = new Response();
		Book book = service.searchBook(name);
		if(book!=null) {
			response.setStatusecode(201);
			response.setMessge("Success");
			response.setDiscription("Book found in the DB");
			response.setBookb(Arrays.asList(book));
         }else {
        	response.setStatusecode(401);
 			response.setMessge("Failure");
 			response.setDiscription("Book not found in the DB");
         }
		return response;
	}
	
	@GetMapping(path="/get/{book_id}",
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Response searchBook(@PathVariable("book_id") int book_id) {
		Response response = new Response();
		Book book = service.searchBook(book_id);
		if(book!=null) {
			response.setStatusecode(201);
			response.setMessge("Success");
			response.setDiscription("Book found in the DB");
			response.setBookb(Arrays.asList(book));
         }else {
        	response.setStatusecode(401);
 			response.setMessge("Failure");
 			response.setDiscription("Book not found in the DB");
         }
		return response;
	}
	

	
	@PutMapping(path="/request/{id}/{book_id}/{status}",
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public Response requestBook(@PathVariable("id")int id,
			@PathVariable("book_id") int book_id,
			@PathVariable("status")String status){
	      Response response = new Response();
	      
	      if(service.requestBook(id, book_id, status)){
	    	  response.setStatusecode(201);
				response.setMessge("Success");
				response.setDiscription("Book is requsted");
	      }else {
	        	response.setStatusecode(401);
	 			response.setMessge("Failure");
	 			response.setDiscription("Book not requested");
	         }
        return response;
	
}

     @GetMapping(path = "/return/{id}/{book_id}",
    		 produces=MediaType.APPLICATION_JSON_VALUE,
			 consumes=MediaType.APPLICATION_JSON_VALUE)	
	public Response returnBook(@PathVariable("id")int id,
			@PathVariable("book_id") int book_id){
	      Response response = new Response();
	      if(service.returnBook(id, book_id)){
	    	  response.setStatusecode(201);
	    	  response.setMessge("sucess");
	    	  response.setDiscription("book is return");
	      }else{
	    	  response.setStatusecode(401);
	    	  response.setMessge("failed");
	    	  response.setDiscription("book is not return");
	      }
				return response;
	}
	
     
     @GetMapping(path="/issue", produces=MediaType.APPLICATION_JSON_VALUE)
 	public Response issueBook(){
 		 Response response = new Response();
 		List<Order> order = service.issueBook();
	      if(order!=null){
	    	  response.setStatusecode(201);
	    	  response.setMessge("sucess");
	    	  response.setDiscription("book is issued");
	      }else{
	    	  response.setStatusecode(401);
	    	  response.setMessge("failed");
	    	  response.setDiscription("book is not issued");
	      }
				return response;
 		
 	}

	
    
}
