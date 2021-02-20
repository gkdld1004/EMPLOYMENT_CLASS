<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>

	<c:if test="${pageContext.request.method ==  'GET'}">
		<div>
			<h2>로그인</h2>
			<form method="POST">
				<p><input type="text" name="id" value="${cookie.userid.value }" placeholder="ID" autofocus required></p>
				<p><input type="password" name="password" placeholder="Password" required></p>
				<div>
					<p>
						<label><input type="checkbox" name="storeid" ${not empty cookie.userid.value ? 'checked' : '' }>ID 저장</label>
						<label><input type="checkbox" name="autologin">자동로그인</label>
					</p>
					<p><input class="btn" type="submit" value="로그인"></p>
				</div>
			</form>
			<br>
			<a href="${cpath }/join.jsp">아직 회원이 아니십니까?</a>
		</div>
	</c:if>
	
	<c:if test="${pageContext.request.method == 'POST' }" >
		<jsp:useBean id="login" class="member.MemberDTO" />
		<jsp:setProperty property="*" name="login" />
		<c:set var="login" value="${memberDAO.login(login)}" scope="session" />
		
		<%
			String storeid = request.getParameter("storeid");
			String autologin = request.getParameter("autologin");
			
			boolean flag1 = storeid != null;
			boolean flag2 = session.getAttribute("login") != null;
			
			Cookie idCookie = new Cookie("userid", login.getId());
			idCookie.setMaxAge(flag1 && flag2 ? 60 * 60 * 24 * 100 : 0);
			response.addCookie(idCookie);
			
			if(autologin != null){
				Cookie auto = new Cookie("JSESSIONID", session.getId());
				auto.setMaxAge(60 * 60 * 24 * 100);
			}
		%>
			
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
