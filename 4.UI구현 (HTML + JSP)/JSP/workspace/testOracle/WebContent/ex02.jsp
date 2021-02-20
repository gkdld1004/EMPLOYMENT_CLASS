<%@page import="testOracle.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DAO, DTO 활용하여 데이터베이스 내용 출력하기</title>
</head>
<body>

<h1>DAO, DTO 활용하여 데이터베이스 내용 출력하기</h1>
<hr>

<c:set var="dao" value="<%=new MemberDAO() %>" />
<c:set var="list" value="${dao.memberList }" />
<table border="1" cellpadding="10" cellspacing="0">
	
	<tr>
		<td>주민등록번호</td>
		<td>이름</td>
		<td>나이</td>
		<td>성별</td>
	</tr>
	<c:forEach var="dto" items="${list }">
	<tr>
		<td>${dto.idNumber }</td>
		<td>${dto.name }</td>
		<td>${dto.age }살</td>
		<td>${dto.gender }</td>
	</tr>
	</c:forEach>
	

</table>

</body>
</html>