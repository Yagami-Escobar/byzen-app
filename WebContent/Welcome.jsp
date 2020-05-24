<%@page import="byzen.modelo.bean.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	
	
	<%
		Usuario u = (Usuario)request.getSession().getAttribute("var_ok");
	%>
	
	<h1>Bienvenido a la Consola Administrativa !!</h1>
	<h2><%=u.getNombre()%></h2>
	<a href="">Cerrar Sesión</a>
		
		
</body>
</html>