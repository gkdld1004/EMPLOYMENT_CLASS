<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>
	<c:if test="${pageContext.request.method == 'GET' }">
		<form method="POST">
			<p><input type="text" name="userid" placeholder="ID를 입력하시오" autofocus required></p>
			<p><input type="password" name="userpw" placeholder="Password를 입력하시오" required></p>
			<p><input type="submit" value="Login" ></p>
		</form>
	</c:if>
	
	<c:if test="${pageContext.request.method == 'POST' }">
		<jsp:useBean id="login" class="user.UserDTO" />
		<jsp:setProperty property="*" name="login"/>
		<c:set var="login" value="${UserDAO.Login(login) }" scope="session" />
		
		<script>
			const flag = '${sessionScope.login}';
			if(flag === '') {
				alert('로그인 실패 !!');
				history.go(-1);
			}
			else {
				location.replace('${cpath}/');
			}
		</script>
		
	</c:if>


</main>

<%@ include file="footer.jsp" %>