<%@page import="joinboard.JoinBoardDAO"%>
<%@page import="upboard.UpBoardDAO"%>
<%@page import="member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<c:set var="memberDAO" value="<%=MemberDAO.getInstance() %>" scope="application"/>
<c:set var="upboardDAO" value="<%=UpBoardDAO.getInstance() %>" scope="application"/>
<c:set var="joinboardDAO" value="<%=JoinBoardDAO.getInstance() %>" scope="application"/>

<%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사</title>
<link rel="stylesheet" href="${cpath }/css/style.css">
</head>
<body>
<header>
	<h1><a href="${cpath }/"><img src="https://cdn.pixabay.com/photo/2017/09/07/08/06/bird-2724144_1280.png" height="60px">설문조사</a></h1>
	<div class="loginInfo">
		<strong>
		${login.name } 
		${not empty login ? '(' : '' }
		${login.id }
		${not empty login ? ')' : '' }
		</strong>
	</div>
</header>

<nav>
	<ul>
		<li>
			<a href="${cpath }/${not empty login ? 'logout.jsp' : 'login.jsp' }">
			${not empty login ? '로그아웃' : '로그인' }
			</a>
		</li>
		<li>
			<a href="${cpath }/joinboard.jsp">설문조사참여</a>
		</li>
		<li>
			<a href="${cpath }/upboard.jsp">설문작성</a>
		</li>
	</ul>
</nav>
</body>
</html>
