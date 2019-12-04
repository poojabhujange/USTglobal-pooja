package com.ustglobal.springmvc.controller;


import java.net.CookieStore;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public class HelloController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor editor = new CustomDateEditor(format, true);	
		binder.registerCustomEditor(Date.class, editor);
	}
	
	
	
	@RequestMapping(path="/hello")
	private String hello(@RequestParam("name")String name,
			             @RequestParam("id") int id,                //query string is taking like this http://localhost:8080/springmvc/hello?name=pooja&id=1
			              ModelMap map) {   
		map.addAttribute("msg", "Hello World");
		map.addAttribute("name",name);
		map.addAttribute("id", id);
		return "index";

	}
	@RequestMapping(path="/hi/{name}/{id}")              //taking as response from brower  like as http://localhost:8080/springmvc/hi/pooja/1
	public String hi(@PathVariable("name")  String name,
			         @PathVariable("id") int id,
		           	 HttpServletRequest request){
		request.setAttribute("msg","Hello java world");
		request.setAttribute("name",name);
		request.setAttribute("id", id);		
		return "index";
	}
	
	@RequestMapping(path="/form") //we given url same bcz method are difrent
	public String formPage(){
		return "form";
	}
	
	@RequestMapping(path="/form",method=RequestMethod.POST)
	public String form(Employee employee, ModelMap map){
		
		map.addAttribute("id",employee.getId());
		map.addAttribute("name", employee.getName());
		
		map.addAttribute("password", employee.getPassword());
		map.addAttribute("gender", employee.getGender());
		map.addAttribute("doj", employee.getDoj());
		
		return "formoutput";
	}
	
	@RequestMapping(path="create-cookies")
	public String createCookies(ModelMap map, HttpServletResponse response){
		
		Cookie cookie = new Cookie("name","Divya");
		response.addCookie(cookie);
		return "createcookie";
	}
     
	@RequestMapping(path="/read-cookie")
	public String  readCookie(ModelMap map, @CookieValue(name="name" ,required=false) String name){
		map.addAttribute("name", name);
		return "readcookie";

	}
	
	@RequestMapping(path="/redirect")
	public String redirect(){
		return "redirect: http://www.google.com";
		
	}
	
	@RequestMapping(path = "/forward")
	public String forward(){
		return "forward:hi/pooja/1";
	}
	
}
