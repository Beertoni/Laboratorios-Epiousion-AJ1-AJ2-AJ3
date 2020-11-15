<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Imprimindo sem Xipression lenguage:
<%String login=(String)request.getParameter("login");
	out.println(login);
	String password = request.getParameter("password");
	%> <br>
	
	Imprimindo sem Xispression de outro jeito
	"
	<%=
	 	request.getParameter("password")
	%>
	"
	<br>
	
	Com Xispression language:
	"${param.login}" para o login
	"${param.password}" para a senha 
	
	<%
	request.setAttribute("login", login);
	request.setAttribute("password", password);
	
	RequestDispatcher rd = request.getRequestDispatcher("pagina3.jsp");
	rd.forward(request, response);
	%>
</body>
</html>