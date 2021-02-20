<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<c:if test="${not empty param.c and param.c eq 'plus'}">
	<c:set var="row" value="${dao.updateViewCount(param.idx) }" />
	<c:redirect url="/view.jsp?idx=${param.idx }&page=${param.page }" />
</c:if>
<c:set var="dto" value="${dao.selectOne(param.idx) }" />
<main>
<div class="viewBoard">
	<p class="boardTitle">${dto.title }</p>
	<div class="wrap">
		<div>${dto.writer } (${dto.ipaddr }) | ${dto.creationDate }</div>
		<div>조회 ${dto.viewCount }</div>
	</div>
	
	<div class="boardContext">
		<pre>${dto.context }</pre>
	</div>
</div>
<div class="wrap">
	<div>
		<a href="${cpath }/"><button>목록</button></a>
	</div>
	<div>
		<a href="${cpath }/update.jsp?idx=${dto.idx}"><button>수정</button></a>
		<button id="deleteBtn">삭제</button>
	</div>
</div>
</main>

<jsp:include page="boardList.jsp?page=${param.page }&idx=${dto.idx }" />

<script>
	const deleteBtn = document.getElementById('deleteBtn');
	deleteBtn.onclick = () => {
		const select = confirm('정말 게시글을 삭제하시겠습니까?');
		if(select) {
			location.replace('delete.jsp?idx=${dto.idx}');
		}
	};
</script>



