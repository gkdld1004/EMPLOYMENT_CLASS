<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>

	<h2>ID 찾기 페이지</h2>
	
	<form method="POST">
		<p><input type="text" name="username" placeholder="사용자 이름을 입력하시오" autofocus required></p>
		<p><input type="text" name="email" placeholder="email을 입력하시오" required></p>
		<p><input type="submit" value="찾기"></p>
	</form>

</main>

<%@ include file="footer.jsp" %>