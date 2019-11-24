package com.ustgolabl.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustgobal.empwebapp.dto.EmployeeDB;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		HttpSession session = req.getSession(false);// check just sessin object presnt or not  . not create new session object
		if(session!=null){
			//EmployeeDB db= (EmployeeDB)session.getAttribute("db");
			
//		PrintWriter out = resp.getWriter();
//		out.println("<h1>Wellcom"+db.getName());
//		out.println("</h1>");
//	
//		out.println("<a href='./logout'>LogOut</a>");
//		out.println("<h1><a href='./Search.html'> Search </a></h1><br>");
//		out.println("<h1><a href='./Changepassword.html'> ChangePassword</a></h1><br>");
//		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/Home.jsp");
		
		}
		else{
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                doGet(req, resp);
	}
	
	
	
	
	
	


}
