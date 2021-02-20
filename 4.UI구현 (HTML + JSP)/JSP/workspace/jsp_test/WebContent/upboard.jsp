<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<main>
	<c:if test="${empty login }">
		<script type="text/javascript">
			alert('로그인이 필요합니다.');
			location.replace('${cpath}/login.jsp');
		</script>
	</c:if>
	
	<c:if test="${not empty login }">
		<form method="post">
			<input type="hidden" name="userIdx" value="${login.idx }">
			<textarea rows="2" cols="40" name="context" placeholder="내용"></textarea>
			<input type="submit" value="완료">
		</form>
	</c:if>
	
	<c:if test="${pageContext.request.method == 'POST' }">
		<jsp:useBean id="context" class="upboard.UpBoardDTO"/>
		<jsp:setProperty property="*" name="context"/>
		<c:set var="row" value="${upboardDAO.insertUpBoard(login.idx, context) }"/>
		<c:if test="${row == 1 }">
			<c:redirect url="joinboard.jsp" />
		</c:if>
		<script>
			const row = ${row };
			
			if (row != 1) {
				alert('입력 실패');
				history.back();
			}
		</script>
	</c:if>
</main>