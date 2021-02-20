<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<c:set var="list" value="${upboardDAO.selectAll() }"/>
<main>
	<h2>설문 참여 페이지</h2>
		<c:forEach var="upboard" items="${list }">
			<div style="border: 1px solid black; margin: 10px; width: 50%">
				<span style="margin-left: 10px;">
				${memberDAO.selectOne(upboard.getUseridx()) } | ${upboard.createDate }
				</span>
				<div style="text-align: center; font-weight: bold;">
					<p><a href="${cpath }/view.jsp?idx=${upboard.idx }">${upboard.context }</a></p>
				</div>
			</div>
		</c:forEach>
</main>