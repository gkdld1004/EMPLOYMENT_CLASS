<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.*, answer.*, survey.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="cpath" value="${pageContext.request.contextPath }" />
<c:set var="memberDAO" value="<%=MemberDAO.getInstance() %>" scope="application" />
<c:set var="answerDAO" value="<%=AnswerDAO.getInstance() %>" scope="application" />
<c:set var="surveyDAO" value="<%=SurveyDAO.getInstance() %>" scope="application" />
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Yes or NO</title>
</head>
<body>

<header>
	<h1><a href="${cpath }/">Yes or No</a></h1>
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
			<a href="${cpath }/surveyBoard.jsp">설문</a>
		</li>
	</ul>
</nav>
