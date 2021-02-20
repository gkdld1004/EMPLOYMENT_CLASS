<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<% request.setCharacterEncoding("UTF-8"); %>

<c:if test="${not empty param.c and param.c eq 'plus'}">
	<c:set var="row" value="${boardDAO.updateViewCount(param.idx) }" />
	<c:redirect url="/view.jsp?idx=${param.idx }&page=${param.page }" />
</c:if>
<c:set var="dto" value="${boardDAO.selectOne(param.idx) }" />

<main>

<div>
	<p>${dto.title }</p>
	<div>
		<div>${dto.username } (${dto.ipaddr }) | ${dto.creationDate }</div>
		<div>조회 ${dto.viewCount }</div>		
	</div>
	
	<div>
	<img src="${cpath }/uploadFolder/${dto.uploadFile}" >
		<pre>${dto.context }</pre>
	</div>
</div>
<div>
	<div>
		<a href="${cpath }/board.jsp?page=${param.page}"><button>목록으로</button></a>
	</div>
	<c:if test="${login.idx == dto.writer}">
	<div>
		<a href="${cpath }/update.jsp?idx=${dto.idx }"><button>수정</button></a>
		<button id="deleteBtn">삭제</button>
	</div>
	</c:if>
</div>
<br>
<c:set var="replyMsg">${empty login ? '댓글은 로그인을 하셔야 이용할 수 있습니다' : '바른 말을 사용합시다' }</c:set>
<c:set var="replyList" value="${replyDAO.selectList(dto.idx) }" />
<div class="w1200 vbox reply">
	<div>
		<c:forEach var="reply" items="${replyList }">
		<div class="hbox sb">
			<div>
				<span class="username">${reply.username }</span>님 [${reply.credate }]
			</div>
			<div>
				<c:if test="${(reply.writer == login.idx or login.userid == 'admin') and reply.deleted == 0 }">
				<a href="${cpath }/deleteReply.jsp?idx=${reply.idx }&user=${login.userid}">삭제</a>
				</c:if>
			</div>
			<div>
				<c:if test="${reply.deleted != 0 }">
					<pre><b style="color: grey">${reply.deleted == 2 ? '관리자' : '작성자' }에 의해 삭제된 게시물입니다</b></pre>
				</c:if>
				<c:if test="${reply.deleted == 0 }">
					<pre><b>${reply.context }</b></pre>
				</c:if>
			</div>
		</div>
		</c:forEach>
	</div>
	
	<%-- insert 쿼리를 수행할 때 필요한 값이 어떤 것이 있는가 확인 --%>
	<form method="POST">
		<input type="hidden" name="boardNum" value="${dto.idx }">
		<input type="hidden" name="writer" value="${login.idx }">
		<div class="hbox fe">
			<div><textarea name="context" 
						   placeholder="${replyMsg }"
						   ${empty login ? 'readonly' : '' }></textarea></div>
			<div><input type="${empty login ? 'button' : 'submit' }" class="btn" value="댓글 작성"></div>
		</div>
	</form>
</div>

<script>
	const deleteBtn = document.getElementById('deleteBtn');
	deleteBtn.onclick = () => {
		const select = confirm('정말 게시글을 삭제하시겠습니까 ?');
		if(select){
			location.replace('delete.jsp?idx=${dto.idx}');
		}
	}
</script>

</main>

<c:if test="${pageContext.request.method == 'POST' }">
	<%-- 댓글 등록 요청을 받으면 --%>
	<jsp:useBean id="user" class="reply2.ReplyDTO" />
	<jsp:setProperty property="*" name="user" />
	<c:set var="row" value="${replyDAO.insertReply(user) }" />
	<%= request.getRequestURI() + request.getQueryString() %>
	<c:redirect url="?${pageContext.request.queryString }" />	
</c:if>

<%-- <jsp:include page="board.jsp?page=${param.page }&idx=${dto.idx }" /> --%>

<%@ include file="footer.jsp" %>