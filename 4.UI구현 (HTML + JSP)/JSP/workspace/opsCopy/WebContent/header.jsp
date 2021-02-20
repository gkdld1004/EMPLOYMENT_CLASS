<%@page import="user.UserDAO"%>
<%@page import="bread.BreadDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<c:set var="BreadDAO" value="<%=BreadDAO.getInstance() %>" />
<c:set var="UserDAO" value="<%=UserDAO.getInstance() %>"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OPS스토어ㅋ</title>
</head>
<body>

<header>
	<h1><a href="${cpath }/">OPS Store</a></h1>
	<hr>
	<div class="loginInfo">
		<strong>
		${login.username } 
		${not empty login ? '(' : '' }
		${login.userid }
		${not empty login ? ')' : '' }
		</strong>
	</div>
</header>

	<ul>
		<li><a href="${cpath }/${not empty login ? 'logout.jsp' : 'login.jsp' }">${not empty login ? 'Logout' : 'Login' }</a></li>
		<li><a href="${cpath }/breadContainer.jsp">Bread_Container</a></li>
	</ul>

</body>
</html>