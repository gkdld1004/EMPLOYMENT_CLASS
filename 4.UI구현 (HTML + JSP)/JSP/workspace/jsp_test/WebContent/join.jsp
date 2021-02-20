<%@page import="member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<%request.setCharacterEncoding("UTF-8");%>

<main>
	<h2>회원가입</h2>
	<div>
		<form method="post">
			<p><input type="text" name="id" placeholder="ID" required autofocus></p>
			<p><input type="password" name="password" placeholder="Password" required></p>
			<p><input type="password" name="confirmPassword" placeholder="Password" required></p>
			<p><input type="text" name="name" placeholder="이름" required></p>
			<p>
				<label><input type="radio" name="gender" value="남성" required>남성</label>
				<label><input type="radio" name="gender" value="여성" required>여성</label>
			</p>
			<p><input type="email" name="email" placeholder="E-Mail" required></p>
			<p><input type="submit" value="가입"></p>
		</form>
	</div>
	
	<c:if test="${pageContext.request.method == 'POST' }">
		<c:if test="${param.password != param.confirmPassword }">
			<script type="text/javascript">
				alert('비밀번호가 일치하지 않습니다');
				history.back();
			</script>
		</c:if>
		<c:if test="${param.password == param.confirmPassword }">
			<jsp:useBean id="join" class="member.MemberDTO"/>
			<jsp:setProperty property="*" name="join"/>
			
			<c:set var="row" value="${memberDAO.insertMember(join) }" />
			<script type="text/javascript">
				const row = ${row};
				let msg;
				
				switch(row){
				case 1:	msg = '가입 성공 !'; break;
				case -1: msg = '이미 사용중인 ID입니다.'; break;
				case 0:	msg = '가입 실패'; break;
				}
				alert(msg);
				if(row == 1){
					location.replace('${cpath}/login.jsp');
				} else{
					history.back();
				}
			</script>
		</c:if>
	</c:if>
</main>