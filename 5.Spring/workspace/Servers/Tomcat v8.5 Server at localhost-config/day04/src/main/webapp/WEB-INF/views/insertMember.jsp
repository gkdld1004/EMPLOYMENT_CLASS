<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<%--
			- 파라미터를 받아서, userpw와 userpw2 가 다르다면, 굳이 DAO를 호출할 필요가 있는가 ??
			
			- DTO 와 다른 형식으로 입력을 받는데, 이거때문에 굳이 클래스를 하나 더 만들어야 하나 ?
			=> HashMap 
	 --%>

	<h2>회원 가입</h2>	
	<form method="POST">
		<p><input name="userid" placeholder="userid" type="text"></p>
		<p><input name="userpw" placeholder="Password" type="password"></p>
		<p><input name="userpw2" placeholder="Password" type="password"></p>
		<p><input name="username" placeholder="Your Name" type="text"></p>
		<p><input name="email" placeholder="name@company.com" type="text"></p>
		<p>
			<label><input type="radio" name="gender" value="남성">남성</label>
			<label><input type="radio" name="gender" value="여성">여성</label>
		</p>
		<p>
			<button class="btn">회원 가입</button>
		</p>
	</form>
	
</main>
</body>
</html>