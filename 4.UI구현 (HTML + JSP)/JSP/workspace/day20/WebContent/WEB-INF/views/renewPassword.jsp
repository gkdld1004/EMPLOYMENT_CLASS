<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>
	<h2>비밀번호 재발급</h2>
	<form method="POST">
		<p><input type="text" name="userid" placeholder="ID" autofocus required></p>
		<p><input type="text" name="username" placeholder="사용자이름" required></p>
		<p><input type="text" name="email" placeholder="이메일입력" required></p>
		<p><input type="submit" value="재발급"></p>
		
	</form>
</main>

<%@ include file="footer.jsp" %>