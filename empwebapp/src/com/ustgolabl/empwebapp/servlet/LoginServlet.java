package com.ustgolabl.empwebapp.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustgobal.empwebapp.dto.EmployeeDB;
import com.ustgobal.webapp.util.EmployeeDaoManager;

@WebServlet("/login")  // this use to configer the url insted of web.xml

public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));// bcz we need the id in string format
		String password = req.getParameter("password");
		String rememberMe = req.getParameter("rememberme");
		if(rememberMe==null){
			Cookie[] cookies = req.getCookies();
			if(cookies!=null){
		for(Cookie cookie :cookies){
			if(cookie.getName().equals("alwayesRemember")){
				cookie.setMaxAge(0);
				resp.addCookie(cookie);
			}
		}
		}
		}else{
			Cookie cookie= new Cookie("alwayesRemember",id+"");
			resp.addCookie(cookie);
			
		}
		
		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
		
		EmployeeDB db = dao.auth(id, password);
		
		
		if(db==null){
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<h1 style ='color:Red'>Invalid id and password</h1>");
			out.println("</html>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
			dispatcher.include(req, resp);
			
			
			
		}else{
			HttpSession session = req.getSession(true);
			session.setAttribute("db", db);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("./Home.jsp");
			dispatcher.forward(req, resp);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
