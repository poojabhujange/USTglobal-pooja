<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<%
String id="";
Cookie[] cookies = request.getCookies();
if(cookies!=null){
for(Cookie cookie :cookies ){
	if(cookie.getName().equals("alwayesRemember")){
		id=cookie.getValue();
	}
}
}
%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><%=msg %></h4>

    <form style='margin: 100px; float: left; aline=center;' action='./login' method='post' >
		<h1 style='color: brown;''>Login Page</h1><br>
		<lable>ID:</lable>
		<input name ='id' type ='number' value='<%=id%>'><br><b>
		<lable>Password :</lable>	
		<input name ='password' type ='password'><br><br>
		
		<input type='checkbox' name='rememberme' value='check'>Remember me<br><br>
		<input name ='login' type='submit'><br><br><br>
		<a style='float: right;'  href='./Register.html'>Register</a>
	</form>
	

</body>
</html>