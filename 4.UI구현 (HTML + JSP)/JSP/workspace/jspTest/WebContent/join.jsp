<%@ page import="member1.MemberDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("UTF-8");
%>

<main>
	<div>
		<h2>회원가입</h2>
		<form method="POST">
			<p><input type="text" name="id" placeholder="ID" required autofocus></p>
			<p><input type="password" name="pw" placeholder="Password" required></p>
			<p><input type="password" name="confirmPassword" placeholder="Password 확인" required></p>
			<p><input type="text" name="name" placeholder="사용자 이름" required></p>
			<p><input type="text" name="email" placeholder="E-Mail" required></p>
			<div class="hbox">
				<label><input type="radio" name="gender" value="남성" required>남성</label>
				<label><input type="radio" name="gender" value="여성" required>여성</label>
			</div>
			<br>
			<div class="vbox">
				<input class="btn" type="submit" value="회원가입">
			</div>
		</form>
	</div>

	<c:if test="${pageContext.request.method == 'POST' }">
		<c:if test="${param.pw != param.confirmPassword }">
			<script>
				alert('비밀번호가 일치하지 않습니다');
				history.go(-1);
			</script>
		</c:if>
		<c:if test="${param.pw == param.confirmPassword }">
			<jsp:useBean id="join" class="member1.MemberDTO" />
			<jsp:setProperty property="*" name="join"/>
			<c:set var="memberDAO" value="<%=MemberDAO.getInstance()%>" />
			<c:set var="row" value="${memberDAO.insertMember(join) }" />
			<script>
				const row = ${row};
				let msg;
				switch(row) {
					case 1: 	msg = '회원 가입 성공 !!'; break;
					case -1: 	msg = '이미 사용중인 ID입니다. 다른 ID를 사용해주세요'; break;
					case 0: 	msg = '회원 가입 실패...'; break;
				}
				alert(msg);
				if(row == 1) {
					location.replace('${cpath}/login.jsp');
				}
				else {
					history.go(-1);
				}
			</script>
		</c:if>
	</c:if>

</main>

<%@ include file="footer.jsp" %>