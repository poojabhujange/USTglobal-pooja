<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<body>

<h4><%=msg%></h4>
<form style="margin: 100px;float: left; aline=center;" action="changepassword" method="post">
<h1 style="color: brown;">change password Page</h1><br>

<lable>New:</lable>
<input name ="password" type ="password"><br><br>

<lable>conform:</lable>
<input name ="confirmpassword" type ="password"><br><br>


<input style="float: right;" value ="Changepassword" type="submit"><br><br><br>
</form>

</body>
</html>