<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>
	
	<c:if test="${pageContext.request.method == 'GET' }">
		<form method="post">
			<div>
				<p><input type="text" name="id" value="${cookie.userid.value }" placeholder="ID" required autofocus></p>
				<p><input type="password" name="password" placeholder="Password" required></p>
				<p>
					<label>
						<input type="checkbox" name="storeid"
								${not empty cookie.userid.value ? 'checked' : '' }>ID 저장
					</label>
					<label>
						<input type="checkbox" name="autologin">자동 로그인
					</label>
				</p>
				<input type="submit" value="로그인">
			</div>
		</form>
		<br>
		<a href="${cpath }/join.jsp">회원가입</a>
	</c:if>
	
	<c:if test="${pageContext.request.method == 'POST' }">
		<jsp:useBean id="login" class="member.MemberDTO" />
		<jsp:setProperty property="*" name="login"/>
		<c:set var="login" value="${memberDAO.login(login) }" scope="session" />
		<%
			String storeid = request.getParameter("storeid");
			String autologin = request.getParameter("autologin");
			
			boolean flag1 = storeid != null;
			boolean flag2 = session.getAttribute("login") != null;
			
			Cookie idCookie = new Cookie("userid", login.getId());
			idCookie.setMaxAge(flag1 && flag2 ? 8640000 : 0);
			response.addCookie(idCookie);
			
			if(autologin != null){
				Cookie auto = new Cookie("JSESSIONID", session.getId());
				auto.setMaxAge(8640000);
			}
		%>
		
		<script type="text/javascript">
			const flag = '${sessionScope.login}';
			if(flag === ''){
				alert('로그인 실패');
				history.back();
			} else {
				location.replace('${cpath}/');
			}
		</script>
	</c:if>
</main>