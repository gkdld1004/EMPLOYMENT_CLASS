<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test0-result.jsp</title>
</head>
<body>
<h1>test0-result.jsp</h1>
<hr>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
%>
<h2><%=id %></h2>
<h2><%=pw %></h2>
</body>
</html>