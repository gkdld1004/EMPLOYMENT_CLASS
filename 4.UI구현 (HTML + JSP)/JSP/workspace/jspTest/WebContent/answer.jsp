<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="list" value="${surveyDAO.selectAll() }" />

<main>

	<div style="">
		<c:forEach var="survey" items="${list }">
			<div>
				<span>${memberDAO.selectOne(survey.getUsernumber()) } | ${answer.credate }</span>
			</div>
			<form method="POST">
				<p>${answer.context }</p>
				<input type="radio" name="yn" value="Yes">Yes
				<input type="radio" name="yn" value="No">No
				<input type="submit" value="전송">
			</form>
			<hr>
			
		<c:if test="${pageContext.request.method == 'POST' }">
			<jsp:useBean id="answer" class="survey.SurveyDTO" />
			<jsp:setProperty property="*" name="answer" />
			<c:set var="row" value="${answerDAO.insertAnswer(answer) }" />
			<c:if test="${row == 1 }">	
				<script>
					alert('설문작성OK');
					
				</script>		
			</c:if>
		</c:if>
		</c:forEach>
	</div>

</main>

<%@ include file="footer.jsp" %>