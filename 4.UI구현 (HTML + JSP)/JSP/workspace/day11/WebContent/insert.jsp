<%@page import="phonebook.PhoneBookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전화번호 하나 추가</title>
<%@ include file="header.jsp" %>
</head>
<body>

<h1><a href="${cpath }">전화번호부</a></h1>
<hr>

<c:if test="${pageContext.request.method == 'GET' }">
	<form method="POST">
		<ul>
			<li>이름 : <input name="name"></li>
			<li>전화번호 : <input name="pnum"></li>
		</ul>
		<button>추가</button>
	</form>
</c:if>

<c:if test="${pageContext.request.method == 'POST' }">
	<% request.setCharacterEncoding("UTF-8"); %>
	<jsp:useBean id="newbie" class="phonebook.PhoneBookDTO" />
	<jsp:setProperty property="*" name="newbie" />
	<c:set var="dao" value="<%=new PhoneBookDAO() %>" />
	<c:set var="row" value="${dao.insert(newbie) }" />
	<c:redirect url="/" />
</c:if>

</body>
</html>





