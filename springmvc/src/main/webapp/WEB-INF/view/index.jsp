
<%
String s =(String)request.getAttribute("msg"); 
%>

<html>
<body>
<h2 style="color:red;">${msg}</h2>
<h2 style ="color:green;"><%=s%></h2>
<h3>${name}</h3>
<h4>${id}</h4>

</body>
</html>
