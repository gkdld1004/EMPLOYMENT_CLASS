<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h2>비밀번호 변경</h2>
<form method="POST">
	<p><input type="hidden" value="userpw"></p>
	<p><input type="password" name="userpw5" placeholder="originally Password"></p>
	<p><input type="password" name="userpw3" placeholder="new Password "></p>
	<p><input type="password" name="userpw4" placeholder="new Password check"></p>
	<p><button class="btn">비밀번호 변경</button></p>
</form>	
	
</main>
</body>
</html>