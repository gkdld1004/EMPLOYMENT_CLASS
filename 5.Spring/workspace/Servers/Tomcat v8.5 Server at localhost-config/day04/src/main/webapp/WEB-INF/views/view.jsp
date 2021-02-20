<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<h2>회원정보</h2>
	
	<p>아이디 : ${login.userid }</p>
	<p>이름 : ${login.username }</p>
	<p>성별 : ${login.gender }</p>
	<p>이메일 : ${login.email }</p>
	
</main>
</body>
</html>