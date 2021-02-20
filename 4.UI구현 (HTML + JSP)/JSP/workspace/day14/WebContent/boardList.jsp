<%@ page import="board1.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<c:set var="dao" value="<%=BoardDAO.getInstance() %>" />

<c:set var="page" value="${empty param.page ? 1 : param.page }" />
<c:set var="map" value="${dao.selectAll(page) }" /><%--pageCount와 list가 함께 들어있다 --%>
<c:set var="list" value="${map.list }" />
<c:set var="pageCount" value="${map.pageCount }" /><%--map.get("pageCount") --%>

<main>
<table id="boardList">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성날짜</th>
			<th>조회수</th>
			<th>IP Address</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list }">
		<tr ${param.idx == dto.idx ? 'class="current"' : '' }>
			<td class="idx">${dto.idx }</td>
			<td class="title"><a href="${cpath }/view.jsp?idx=${dto.idx}&page=${page }&c=plus">${dto.title }</a></td>
			<td class="writer">${dto.writer }</td>
			<td class="creationDate">${dto.creationDate }</td>
			<td class="viewCount">${dto.viewCount }</td>
			<td class="ipaddr">${dto.ipaddr }</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<div class="wrap">
	<div>
		<form>
			<select name="type">
				<option value="idx">글번호로 검색</option>
				<option value="title">제목으로 검색</option>
				<option value="writer">이름으로 검색</option>
				<option value="context">내용으로 검색</option>
			</select>
			<input type="text" name="word" placeholder="검색어를 입력하세요" autocomplete="off">
			<input type="submit" value="검색">
		</form>
	</div>
	<div>
		<a href="${cpath }/write.jsp"><button>새 글 작성</button></a>
	</div>
</div>

<div class="paging">

	<c:if test="${map.prev }">
		<a href="${cpath }/?page=${map.begin - 1}">◀</a>
	</c:if>
	
	<c:forEach begin="${map.begin }" end="${map.end }" var="i">
		<a href="${cpath }/?page=${i}">
		${i == page ? '<strong>' : '' }
			[${i }]
		${i == page ? '</strong>' : '' }
		</a>
	</c:forEach>
	
	<c:if test="${map.next }">
		<a href="${cpath }/?page=${map.end + 1}">▶</a>
	</c:if>

</div>

</main>
<%@ include file="footer.jsp" %>









