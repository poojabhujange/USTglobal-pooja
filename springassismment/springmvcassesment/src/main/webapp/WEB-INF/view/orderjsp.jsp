<%@page import="com.ustglobal.springmvcassesment.dto.Custmar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
		Custmar custmar = (Custmar) session.getAttribute("custmar");
		if (custmar != null) {
			out.print("<h1>Hello , " + custmar.getName() + "</h1>");
		} else {
			response.sendRedirect("./login");
		}
	%>

<fieldset>
		<legend>Search Product</legend>
		<form action="./order">
			<table>
				<tr>
					<td>orderId:</td>
					<td><input type="number" name="id"></td>
				</tr>
				
				<tr>
				<td>Custmarid</td>
				<td><input type="number" name="custmid"></td>
				</tr>
				
				<tr>
				<td>productName	</td>
				<td><input type="text" name="productname"></td>
				</tr>
				
				<tr>
				<td>productId</td>
				<td><input type="number" name="Productid"></td>
				</tr>
			
				<tr>
				<td>quntity	</td>
				<td><input type="number" name="quntity"></td>
				</tr>
					
				<tr>
				<td>amountpayable	</td>
				<td><input type="number" name="totalprice"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	<center>
		<h2>${ordermsg}</h2>
	</center>
		<center>
		<h2>${msgs}</h2>
	</center>
	
	


</body>
</html>