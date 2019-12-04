package com.ustglobal.empspringmvc.controller;

import java.net.Authenticator.RequestorType;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.mysql.fabric.xmlrpc.base.Data;
import com.ustglobal.empspringmvc.dto.EmployeeBean;
import com.ustglobal.empspringmvc.service.EmployeeService;
import com.ustglobal.empspringmvc.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	
	
	
	@Autowired
	private EmployeeService service ;
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat format =
				new SimpleDateFormat("YYYY-MM-DD");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
		
	} 
	
	
	
	
	
	
	@GetMapping("/login")
	public String loginPage(){
		return "login";
	}//end off loginpage
	
	@PostMapping("/login")
	public String login(int id, String password,HttpServletRequest request){
		EmployeeBean bean = service.login(id, password);
		
		if(bean==null){
			request.setAttribute("msg", "Invalid credentials");
			return "login";
		
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
		
		
	}//end of login
	
	@GetMapping("/register")
	public String registerPage(){
		return "register";
	}//end of register page
	
	
	@PostMapping("/register")
	public String register(EmployeeBean bean,ModelMap map){
		int check = service.register(bean);
		if(check>0){
			map.addAttribute("msg","You are Register and ID is "+check);
			
		}else{
			map.addAttribute("msg","Email is repeted");
		}
		return "login";
	}//end of the register
	
	@GetMapping("/home")
	public String home(ModelMap map,@SessionAttribute(name = "bean", required= false) EmployeeBean bean){
		if(bean==null){
			map.addAttribute("msg", "Login first!!!");
			return "login";
			
		}else{
			return "home";
		}
		
		
	}
	@PostMapping("/home")
	public String home(){
		return "home";
	}//end of home
	
	
	@GetMapping("/search")
	public String search(@RequestParam("id") int id,ModelMap map){
		EmployeeBean bean = service.searchEmployee(id);
		if(bean == null){
			map.addAttribute("msg", "Data Not Found");
			
		}else {
			map.addAttribute("bean",bean);
		}
		return "home";
	}
	
	
	@GetMapping("/logut")
	public String logout(HttpSession session){
		session.invalidate();
		return "login";
		
	}
	
	@GetMapping("/delete")
	public String deletProfile(HttpSession session){
		EmployeeBean bean = (EmployeeBean)session.getAttribute("bean");
		try{
		service.deletEmployee(bean.getId());
		}catch(Exception e){
			e.printStackTrace();
		}
		session.invalidate();
		return "login";
	}//end of deleteprofile
	
	
	
	@GetMapping("/changepassword")
	public String changepassword(HttpServletRequest request ){
		HttpSession session = request.getSession(false);
		if(session!= null){
			return "changepassword";
		}else{
			return "login";
		}
		
		
	}
	
	@PostMapping("/changepassword")
	public String changepassword(String password,String confirmpassword,
			@SessionAttribute(name="bean")EmployeeBean bean,ModelMap map){
		if(password.equals(confirmpassword)){
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg", "password changed");
		}else{
			map.addAttribute("msg", "password not Matching");
			
			
		}
		return "home";
	}
	
	@GetMapping("/update")
	public String updateProfile(HttpServletRequest request ){
		HttpSession session = request.getSession();
		
		if(session!= null){
			return "update";
		}else{
			return "login";
		}
		
	}
	
	
	@PostMapping("/update")
	public String updateProfile(String name, String password,String gender,Date doj,
			@SessionAttribute(name="bean")EmployeeBean bean,ModelMap map){
		    bean.setName(name);
		    bean.setPassword(password);
		    bean.setGender(gender);
		    bean.setDoj(doj);
		    boolean check = service.updateEmployee(bean);
		    if(check){
		    	return "home";
		    	
		    }else{
		    	return "login";
		    }
	
		
		
		
		
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
