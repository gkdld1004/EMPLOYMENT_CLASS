<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz3.jsp</title>
</head>
<body>

<%--

	day07 Member 클래스를 활용하여 로그인을 구현하고
	ID 저장과 자동 로그인을 구현한 후에
	
	day07패키지에 Item 클래스를 작성하세요
	상품의 목록을 출력하는 quiz3List.jsp 가 있어야 합니다
	도서 관리 프로그램과 유사하게 처리하세요
	
	목록은 이미 만들어져 있고, 목록에서 특정 상품을 장바구니에 추가하는 코드를 만들어주세요
	장바구니에 담긴 목록은 로그인 된 상태에서 장바구니 메뉴에 들어가면 출력되어야 합니다
	장바구니의 구성은 상품 이름과 가격만 넣어주세요
	
	Cookie는 브라우저마다 다르게 처리되므로, chrome과 Edge에서 동시에 다른 상품을 장바구니에 넣어보세요
	장바구니의 목록이 여러개라면, 구분할수 있는 기호를 넣어서 문자열을 만들고
	new Cookie("basket", "item1:29000,item2:35000,item3-500,");
	String [] arr = cookie.value().split(":");

--%>

</body>
</html>