package com.ustglobal.springmvcassesment.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.springmvcassesment.dto.ProductBean;
import com.ustglobal.springmvcassesment.dto.Custmar;
import com.ustglobal.springmvcassesment.service.CustmorService;


@Controller
public class CustmorController {
	
	@Autowired
	private CustmorService service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of loginPage()

	@PostMapping("/login")
	public String login(int id,String password,HttpServletRequest request) {

		Custmar bean=service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg","Invalid Credentials");
			return "login";
		}
		else {
			HttpSession session=request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}

	}//end of login()

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}//end of registerPage().

	@PostMapping("/register")
	public String register(Custmar bean,ModelMap map) {
		
		int check=service.register(bean);
		if(check>0) {
			map.addAttribute("msg","You are Registered and Id is "+check);
		}
		else {
			map.addAttribute("msg","email is repeted");
		}
		
		return "login";
	}//end of register()
	
	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name="bean",required = false) Custmar bean) {
		if(bean==null) {
			map.addAttribute("msg","Login First!!!!!");
			return "login";
		}
		else {
			return "home";
		}
	}//end of home()

	@PostMapping("/home")
	public String home() {
		return "home";
	}//end of home()
	
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		if(session!=null) {
			return "changepassword";
		}
		else {
			return "login";
		}
	}
	
	@PostMapping("/changepassword")
	public String changePassword(String password,String confirmpassword,@SessionAttribute(name="bean")Custmar bean,ModelMap map) {
		if(password.equals(confirmpassword)) {
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg","password changed");
		}else {
			map.addAttribute("msg", "password not matching");
		}
		return "home";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//end of logout()
	
	@GetMapping("/search")
	public String search(@RequestParam("name")String name,ModelMap map) {
		ProductBean bean=service.searchProduct(name);
		if(bean==null) {
			map.addAttribute("msg","Data not found");
		}
		else {
			map.addAttribute("bean",bean);
		}
		return "home";
	}
	
}
