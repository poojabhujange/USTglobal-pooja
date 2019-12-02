<%@page import="com.ustglobal.springmvcassesment.dto.Custmar"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="com.ustglobal.springmvcassesment.dto.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	Custmar bean = (Custmar) session.getAttribute("bean");
	ProductBean bean1=(ProductBean) session.getAttribute("bean1");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">change password</a>
	<a href="./logout" style="float: right;">logout</a>
	<h2>
		Welcome<%=bean.getName()%></h2>
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
		ProductBean productBean=(ProductBean) request.getAttribute("bean1");
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
			
		</tr>
	</table>

	<%
		}
	%>
	<h3>${msg}</h3>
</body>
</html>