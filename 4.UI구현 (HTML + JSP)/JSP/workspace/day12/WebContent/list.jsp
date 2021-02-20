<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="page" value="${empty param.page ? 1 : param.page }" /> 
<c:set var="map" value="${dao.selectAll(page) }" />
<c:set var="list" value="${map.list }"/>
<main>
<div class="paging">

	<c:if test="${prev }">
		<a href="${cpath }/?page=${map.begin - 1}">PREV</a>
	</c:if>
	
	<c:forEach begin="${map.begin }" end="${map.end }" var="i">
		
		
		<a href="${cpath }/?page=${i}">
		${i == page ? '<strong>' : '' }
			[${i }]
		${i == page ? '</strong>' : '' }
		</a>
	
	
	</c:forEach>
	
	<c:if test="${prev }">
		<a href="${cpath }/?page=${map.begin + 1}">NEXT</a>
	</c:if>
</div>
</main>