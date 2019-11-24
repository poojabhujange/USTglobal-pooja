package com.ustglobal.webap.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String search = req.getParameter("search");
		
		String select = req.getParameter("select");
		
				
		if(select.equals("Bing")){
			resp.sendRedirect("http://www.bing.com/search?q="+search);
		}else if(select.equals("google")){
			resp.sendRedirect("http://www.google.com/search?q="+search);
		}else{
	
		resp.sendRedirect("http://www.yahoo.com/search?p="+search);
		}
		
	
		
		
	}

}
