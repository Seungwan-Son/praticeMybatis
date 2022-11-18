<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>글 목록</h1>
	
		<c:forEach var="b" items="${bDatas}">
	<tr>
		<td>글 제목 : ${b.title}</td>
		<td><a href="selectOneBoard.do?${b.bid}">글 상세보기</a></td>		
	</tr>
		</c:forEach>
</body>
</html>