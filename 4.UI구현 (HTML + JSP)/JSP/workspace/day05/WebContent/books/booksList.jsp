<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>
<main>

<%
	ArrayList<Books> list = (ArrayList<Books>)application.getAttribute("list");

	for(int i = 0; i < list.size(); i++){
		Books b = list.get(i);
		out.print("<p> " + i + " : " + b + "</p>");
	}
%>

</main>
</body>
</html>