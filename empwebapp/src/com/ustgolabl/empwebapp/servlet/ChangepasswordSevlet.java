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

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustgobal.empwebapp.dto.EmployeeDB;
import com.ustgobal.webapp.util.EmployeeDaoManager;

@WebServlet("/changepassword")
public class ChangepasswordSevlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		if(session!=null)
		{

			String pass = req.getParameter("password");
			String conformpass = req.getParameter("confirmpassword");
			
			if(pass.equals(conformpass)){
				EmployeeDB db = (EmployeeDB)session.getAttribute("db");
				
				EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
				dao.changePassword(db.getId(), pass);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/Home.jsp");
				dispatcher.forward(req,resp);

				
			}else{
				String msg = "password not matching";
				req.setAttribute("msg", msg);
				
//				PrintWriter out = resp.getWriter();
//				out.println("<html>");
//				out.println("<h4>password not matching</h4>");
//				out.println("</html>");
//				RequestDispatcher dispatcher = req.getRequestDispatcher("/Changepassword");
//				dispatcher.include(req,resp);
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("/Changepassword.jsp");
				dispatcher.forward(req,resp);
				
			}
			
			
		}else{
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
		
		
		
	}
}
