<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="db" class="com.ustgobal.empwebapp.dto.EmployeeDB"
    scope="session"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a style="float:right" href='./logout'>LogOut</a>
	<h1> Welcome <%=db.getName() %></h1>

	<h1><a href='./Search.html'> Search </a></h1><br>
	<h1><a href='./Changepassword.jsp'> ChangePassword</a></h1><br>

</body>
</html>