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
	<h1>�� ���</h1>
	
		<c:forEach var="b" items="${bDatas}">
	<tr>
		<td>�� ���� : ${b.title}</td>
		<td><a href="selectOneBoard.do?${b.bid}">�� �󼼺���</a></td>		
	</tr>
		</c:forEach>
</body>
</html>