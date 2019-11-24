package com.ustgolabl.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustgobal.empwebapp.dto.EmployeeDB;
import com.ustgobal.webapp.util.EmployeeDaoManager;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        
        EmployeeDB db = new EmployeeDB();
        db.setId(id);
        db.setName(name);
        db.setEmail(email);
        db.setPassword(password);
        
    	EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
       boolean check= dao.registerEmployee(db);
     String msg ="";
        PrintWriter out = resp.getWriter();
        if(check){
//        	out.println("<html>");
//        	out.println("<h1>Register is complet</h1>");
//        	out.println("</html>");
        	 msg="Regster comnplet";
        	
        	
        }else{
//        	out.println("<html>");
//        	out.println("<h4>id can not be repeted</h4>");
//        	out.println("</html>");
        	
           msg ="Id not found";
        }
        req.setAttribute("msg",msg);
        RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
		dispatcher.forward(req, resp);
		
		
		
		
		
		
	}

}
