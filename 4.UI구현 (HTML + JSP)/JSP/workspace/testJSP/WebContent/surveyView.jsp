<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>

	<c:set var="dto" value="${surveyDAO.selectOne(param.sidx) }" />
	<c:set var="counting" value="${answerDAO.countAll(dto.idx) }" />
	<c:set var="Yes" value="${answerDAO.selectAnswer(dto.idx) }" />
	<c:set var="No" value="${count - Yes }" />
	<c:set var="PerYes" value="${(100 / counting) * Yes }" />
	<c:set var="PerNo" value="${(100 / counting) * No }" />
	<c:if test="${No == 0 && Yes == 0 }">
		<c:set var="PerYes" value="50" />
		<c:set var="PerNo" value="50" />
	</c:if>


	<c:if test="${pageContext.request.method == 'GET' }">
		<c:if test="${empty login }">
			<script>
				alert('회원만 답변 가능 !');
				location.replace('${cpath}/login.jsp');
			</script>
		</c:if>
	</c:if>
	
	<h2>설문 답변하기</h2>
	
		<fieldset style="width: 700px;">
			<div id="between">
				<div>등록: ${dto.name}</div>
				<div>날짜: ${dto.regdate}</div> 
			</div>
			<div class="context">
				<a href="${cpath }/surveyView.jsp">
					${dto.context}
				</a>
			</div>
			<div class="bar">
				<div style="width: ${PerYes}%; float: left; background-color: black; color:white; text-align: left; ">
					YES (${YES })
				</div>
				<div style="width: ${PerNo}%; float: right; background-color: white; color:black; text-align: right;">
					(${NO }) NO 
				</div>
			</div>
			<br>
			<div style="display: flex; justify-content: space-between;">
				<div>
					<p><input type="button" value="YES"></p>
				</div>
				<div>
					<input type="button" value="NO">
				</div>
			</div>
		</fieldset>
		<div>
			<input type="button" value="뒤로가기" onclick="history.go(-1)">
		</div>
</main>

<%@ include file="footer.jsp" %>
