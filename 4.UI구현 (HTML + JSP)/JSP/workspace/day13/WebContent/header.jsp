<%@page import="board1.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="dao" value="<%=BoardDAO.getInstance() %>" />
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet" href="${cpath }/css/style.css">
</head>
<body>
<header>
	<h1><a href="${cpath }/">게시판</a></h1>
</header>

</body>
</html>