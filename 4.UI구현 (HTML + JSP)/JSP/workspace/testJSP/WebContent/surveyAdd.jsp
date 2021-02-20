<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>

	<c:if test="${pageContext.request.method == 'GET' }">
		<c:if test="${empty login }">
			<script>
				alert('회원만 등록 가능 !');
				location.replace('${cpath}/login.jsp');
			</script>
		</c:if>
	</c:if>
	
	<h2>설문 등록하기</h2>
	
	<c:if test="${not empty login }">
		<form method="POST">
			<input type="hidden" name="regmember" value="${login.idx }">
			<input type="hidden" name="regdate" value="${dto.regdate }">
			<input type="text" name="context" placeholder="설문 내용 입력" required>
			<div>
				<input type="submit" value="설문 등록">
				<input type="button" value="뒤로가기" onclick="history.go(-1)">
			</div>
		</form>
	</c:if>
	<c:if test="${pageContext.request.method == 'POST' }">
		<jsp:useBean id="context" class="survey.SurveyDTO"/>
		<jsp:setProperty property="*" name="context"/>
		<c:set var="row" value="${surveyDAO.insertSurvey(context, param.regmember) }" />
		<c:if test="${row == 1 }">
			<c:redirect url="surveyBoard.jsp" />
		</c:if>
		<script>
			const row = ${row};
			if(row != 1){
				alert('설문등록 실패 !!');
				history.go(-1);
			}
		</script>
	</c:if>
	
</main>

<%@ include file="footer.jsp" %>
