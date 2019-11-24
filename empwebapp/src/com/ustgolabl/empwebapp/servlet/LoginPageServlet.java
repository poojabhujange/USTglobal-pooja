package com.ustgolabl.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Login.html")
public class LoginPageServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out = resp.getWriter();
		
		String id="";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null){
		for(Cookie cookie :cookies ){
			if(cookie.getName().equals("alwayesRemember")){
				id=cookie.getValue();
			}
		}
	}
		out.println("<html>");
		out.println("<form style='margin: 100px; float: left; aline=center;' action='./login' method='post' >");
		out.println("<h1 style='color: brown;''>Login Page</h1><br>");
		out.println("<lable>ID:</lable>");
		out.println("<input name ='id' type ='number' value='"+id+"'><br><br>");	
		out.println("<lable>Password :</lable>");	
		
		out.println("<input name ='password' type ='password'><br><br>");
		out.println("<input type='checkbox' name='rememberme' value='check'>Remember me<br><br>");	
		out.println("<input name ='login' type='submit'><br><br><br>");
		out.println("<a style='float: right;'  href='./Register.html'>Register</a>");
		
		out.println("</form>");
		out.println("</html>");
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		doGet(req, resp);
	}
	
}
