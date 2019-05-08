<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="frm1" action="MySer" method="post">
Enter FullName
<br>
<input type="text" name="txtname" placeholder="enter name" />
<br>
<input type="submit" name="btnsubmit" value="Click" />
</form>

<form name="frm2" action="" method="post">
Enter FullName
<br>
<input type="text" name="txtname" placeholder="enter name" />
<br>
<input type="submit" name="btnsubmit1" value="Click" />
</form>


<a href="MySer">Click to navigate Servlet</a>
<%

if(request.getParameter("btnsubmit1")!=null)
{
	response.sendRedirect("MySer");
}


%>

</body>
</html>