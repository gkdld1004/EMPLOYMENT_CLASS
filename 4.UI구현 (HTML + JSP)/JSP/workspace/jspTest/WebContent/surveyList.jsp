<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="surveyList" value="${answerDAO.selectList(idx) }" />

<main>

	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>질문내용</th>
				<th>답변</th>
				<th>작성일자</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="dto" items="${surveyList.list }">
			<tr>
				<th>${dto.idx }</th>
				<th>${dto.context }</th>
				<th>${dto.answer }</th>
				<th>${dto.cdate }</th>
			</tr>
		</c:forEach>
		</tbody>
	</table>

</main>

<%@ include file="footer.jsp" %>