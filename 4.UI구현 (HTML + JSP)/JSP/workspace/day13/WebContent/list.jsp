<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

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
		<tr>
			<td class="idx">${dto.idx }</td>
			<td class="title"><a href="${cpath }/view.jsp?idx=${dto.idx}">${dto.title }</a></td>
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
			<input type="text" name="word" placeholder="검색어를 입력하세요">
			<input type="submit" value="검색">
		</form>
	</div>
	<div>
		<a href=""><button>새 글 작성</button></a>
	</div>
</div>

<div class="paging">
<c:forEach begin="1" end="${pageCount }" var="i">
	<a href="${cpath }/?page=${i}">
	${i == page ? '<strong>' : '' }
		[${i }]
	${i == page ? '</strong>' : '' }
	</a>
</c:forEach>
</div>

</main>
<%-- <%@ include file="footer.jsp" %> --%>