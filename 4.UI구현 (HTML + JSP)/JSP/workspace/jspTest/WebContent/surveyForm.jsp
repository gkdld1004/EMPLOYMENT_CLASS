<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<% request.setCharacterEncoding("UTF-8"); %>

<main>

	<c:if test="${pageContext.request.method == 'GET' }">
	<c:if test="${empty login }">
		<script>
			alert('회원만 작성 가능 !');
			location.replace('${cpath}/login.jsp');
		</script>
	</c:if>
	</c:if>
	
	<div>
	<form method="POST" enctype="multipart/for-date">
	
		<input type="hidden" name="name" value="${login.idx }">
		<div>
			<p><input type="text" name="context" placeholder="질문 입력 (Yes or No)"></p>
		</div>
		<div>
			<input type="submit" value="등록">
		</div>
	</form>
	</div>
	
	<c:if test="${pageContext.request.method == 'POST' }">
		<jsp:useBean id="context" class="answer.AnswerDTO" />
		<jsp:setProperty property="*" name="context"/>
		<c:set var="row" value="${surveyDAO.insert(mnum, context) }" />
		<c:if test="${row == 1 }">
			<c:redirect url="answer.jsp" />
		</c:if>
		
		<script>
			const row = ${row};
			if(row != 1){
				alert('등록실패 !!');
				history.go(-1);
			}
			else{
				alert('등록성공 !!');
			}
		</script>
	</c:if>

</main>

<%@ include file="footer.jsp" %>