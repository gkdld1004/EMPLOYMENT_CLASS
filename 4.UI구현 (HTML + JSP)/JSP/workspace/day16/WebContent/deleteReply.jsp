<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="row" value="${replyDAO.deleteReply(param.idx, param.user) }" />
<c:redirect url="${header.referer }" />