<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day02</title>
</head>
<body>

<h1>이름과 나이 출력하기</h1>
<hr>

<p>이름 : 박윤환</p>
<p>나이 : 32세</p>

<p>이름 : ${name }</p>
<p>나이 : ${age }세</p>

<h2>예제</h2>
<ul>
	<li><a href="<c:url value="ex01" />">ex01</a></li>
	<li><a href="<c:url value="ex02" />">ex02</a></li>
	<li><a href="<c:url value="ex03" />">ex03</a></li>
	<li><a href="<c:url value="ex04" />">ex04</a></li>
	<li><a href="<c:url value="ex05" />">ex05</a></li>
</ul>

</body>
</html>