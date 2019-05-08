<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int a,b,c; %>
<form action="" method="post">
<input type="text" placeholder="enter first number" name="txtnum1" />
<br>
<input type="text" placeholder="enter second number" name="txtnum2" />
<br>
<input type="submit" name="btnsubmit" value="click"> 

</form>

<%
if(request.getParameter("btnsubmit")!=null)
{
	a = Integer.parseInt(request.getParameter("txtnum1"));
	b = Integer.parseInt(request.getParameter("txtnum2"));
	a = a+b;
	b = a-b;
	a = a-b;
   	
}





%>


Result is <%= "a="+a+" b="+b %>
</body>
</html>