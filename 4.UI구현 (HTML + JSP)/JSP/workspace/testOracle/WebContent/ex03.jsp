<%@page import="testOracle.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03.jsp - 추가</title>
</head>
<body>

<h1>데이터 베이스에서 member추가 </h1>
<hr>
${pageContext.request.method } 이거 켜져있네??? 

<c:if test="${pageContext.request.method == 'GET' }">
	<form method="POST">
		<p><input name="idNumber" placeholder="주민등록번호" required autofocus></p>
		<p><input name="name" placeholder="이름" required></p>
		<p><input name="age" placeholder="나이" required></p>
		<p><input name="gender" placeholder="성별" required></p>
		<p><input type="submit" value="추가"></p>
	</form>
</c:if>

<c:if test="$pageContext.request.method == 'POST' }">
	<% request.setCharacterEncoding("UTF-8"); %>
	<jsp:useBean id="bean" class="testOracle.MemberDTO" />
	<jsp:setProperty property="*" name="bean" />
	<c:set var="dao" value="<%=new MemberDAO() %>" />
	<c:set var="row" value="${dao.insertMember(bean) }" />
	
	<c:if test="${row == 1 }">
		<c:redirect url="ex02.jsp" />
	</c:if>
	
	<c:if test="${row == 0 }">
		<c:redirect url="ex03.jsp" />
	</c:if>

</c:if>


</body>
</html>