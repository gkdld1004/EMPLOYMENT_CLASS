<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<c:set var="dto" value="${dao.selectOne(param.idx) }" />
<main>
<div class="viewBoard">
	<p><strong>${dto.title }</strong></p>
	<p>${dto.writer } (${dto.ipaddr }) | ${dto.creationDate }
	
</div>
</main>
<%@ include file="footer.jsp" %>