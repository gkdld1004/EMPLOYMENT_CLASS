<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<main>
<% request.setCharacterEncoding("UTF-8"); %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />

<c:set var="page" value="${empty param.page ? 1 : param.page }" />

<table style="border:1px solid black;">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>IP</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="dto" items="${map.list }">
		<tr>
			<td>${dto.idx }</td>
			<td><a href="${cpath }/view?idx=${dto.idx}&page=${param.page}&type=${param.type }&word=${param.word }&c=plus">${dto.title }</a></td>
			<td>${dto.username }</td>
			<td>${dto.viewCount }</td>
			<td>${dto.ipaddr }</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
<br>

<div class="wrap">
	<div>
		<form action="search.jsp">
			<select name="type">
				<option value="idx" ${param.type == 'idx' ? 'selected' : '' }>글번호로 검색</option>
				<option value="title" ${empty param.type && param.type == 'title' ? 'selected' : '' }>제목으로 검색</option>
				<option value="username" ${param.type == 'username' ? 'selected' : '' }>이름으로 검색</option>
				<option value="context" ${param.type == 'context' ? 'selected' : '' }>내용으로 검색</option>
			</select>
			<input type="text" name="word" value="${param.word }" placeholder="검색어를 입력하세요" autocomplete="off">
			<input type="hidden" name="page"  value="${param.page }">
			<input type="submit" value="검색">
		</form>
	</div>
		<div>
			<a href="${cpath }/write.jsp"><button>새 글 작성</button></a>
		</div>
	</div>
<br>
<div class="paging">
	<c:if test="${map.paging.prev }">
		<a href="${cpath }/board.jsp?page=${map.paging.begin - 1}">◀</a>
	</c:if>
	
	<c:forEach begin="${map.paging.begin }" end="${map.paging.end }" var="i">
		<a href="${cpath }/board.jsp?page=${i}">
		${i == page ? '<strong>' : '' }
			[${i }]
		${i == page ? '</strong>' : '' }
		</a>
	</c:forEach>
	
	<c:if test="${map.paging.next }">
		<a href="${cpath }/board.jsp?page=${map.paging.end + 1}">▶</a>
	</c:if>
</div>

</main>
<%@ include file="footer.jsp" %>