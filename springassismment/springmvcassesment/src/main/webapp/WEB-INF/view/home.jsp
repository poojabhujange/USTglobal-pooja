<%@page import="com.ustglobal.springmvcassesment.dto.Custmar"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="com.ustglobal.springmvcassesment.dto.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%
	Custmar bean = (Custmar) session.getAttribute("bean");
if(bean!=null){
	
	out.print("Welcome "+ bean.getName());
}else{
	response.sendRedirect("./login");
}
	%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><br>
	<a href="./changepassword">change password</a>
	<a href="./logout" style="float: right;">logout</a>
	
	<fieldset>
		<legend>Search Product</legend>
		<form action="./search">
			<table>
				<tr>
					<td>Id:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%
		ProductBean productBean=(ProductBean) request.getAttribute("bean");
	%>
	<%
		if (productBean != null) {
	%>

	<table>
		<tr>
			<th>Name</th>
			<th>Price</th>
			
		</tr>
		<tr>
			<td><%=productBean.getName()%></td>
			<td><%=productBean.getPrice()%></td>
			<td><button href="">Order</button>
			
		</tr>
	</table>

	<%
		}
	%>
	<h3>${msg}</h3>
</body>
</html>