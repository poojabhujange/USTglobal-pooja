<%@page import="com.ustgobal.empwebapp.dto.EmployeeDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>



<% 
EmployeeDB db = (EmployeeDB)request.getAttribute("db");
%>
<body>
		
		<a href='./Home.jsp'>HOME</a>
		<a style='float:right' href='./logout'>Logout</a>
		<%if(db!=null){ %>
		
	<fieldset>
	<legend>Employe db</legend>
	<table align="center">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
		</tr>
		
		<tr>
			<td><%=db.getId() %></td>
			<td><%=db.getName() %></td>
			<td><%=db.getEmail() %></td>
	   </tr>
	</table>
</fieldset>

<%}else{ %>
<h1>data is not found</h1>
<%} %>
</body>
</html>