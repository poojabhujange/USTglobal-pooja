package com.ustglobal.webap.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmpServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
		
		String empid = req.getParameter("empid");
		int id  = Integer.parseInt(empid);
		
		PrintWriter out = resp.getWriter();
		
		String url="jdbc:mysql://localhost:3306/ust_ty_db?";
	    String sql ="select * from Employee_Info";
	    Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");	
		    conn =DriverManager.getConnection(url,"root","root");//method overloading
		    pstmt=conn.prepareStatement(sql);
		    pstmt.setInt(1, id);
		    rs=pstmt.executeQuery();
		    
		    while(rs.next()){
		    	int id1 = rs.getInt("id");
		    	String name=rs.getString("name");
		         int salary = rs.getInt("salary") ;
		         String gender = rs.getString("gender");
		         
		         out.println("<html>");
		         out.println("<body>");
		         out.println("<table>");
		         out.println("<tr>");
		         out.println("<th>");
		         out.println("<Empid>");
		         out.println("</th>");
		         out.println("<th>");
		         out.println("<Name>");
		         out.println("</th>");
		         out.println("<th>");
		         out.println("<salary>");
		         out.println("</th>");
		         out.println("<th>");
		         out.println("<Gender>");
		         out.println("</th>");
		         out.println("</tr>");
		       
		         out.println("<tr>");
		         out.println("<td>");
		         out.println("<id>"); 
		         out.println("</td>");
		         out.println("<td>");    
		         out.println("<name>");
		         out.println("</td>");   
		         out.println("<td>");
		         out.println("<salary>");
		         out.println("</td>");
		         out.println("<td>");
		         out.println("<gender>");
		         out.println("</td>");
		         
		         out.println("</html>");
		         out.println("</body>");
		         out.println("</table>");
		         
		         }
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(conn!=null){
					conn.close();
				}
				if(pstmt!=null){
					pstmt.close();
				}
				if(rs!=null){
					rs.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		
	}//end of main();
		
		
	}
