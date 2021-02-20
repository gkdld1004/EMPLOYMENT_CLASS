<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<c:set var="list" value="${surveyDAO.selectAll()}" />
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

<main>
	<h2>설문 리스트</h2>
	<c:forEach var="survey" items="${list}">
		<fieldset style="width: 700px;">
			<div id="between">
				<div>등록: ${dto.regname}</div>
				<div>날짜: ${survey.regdate}</div> 
			</div>
			<div class="context">
				<a href="${cpath }/surveyView.jsp">${survey.context}</a>
			</div>
			<div class="bar">
				<div style="width: ${PerYes}%; float: left; background-color: black; color:white; text-align: left; ">
					YES (${Yes })
				</div>
				<div style="width: ${PerNo}%; float: right; background-color: white; color:black; text-align: right;">
					(${No }) NO 
				</div>
			</div>
		</fieldset>
	</c:forEach>
	
	<div>
		<a href="surveyAdd.jsp"><button>설문 등록</button></a>
	</div>

</main>

<%@ include file="footer.jsp" %>
