<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>글 상세페이지</h1>
	<table>
	<tr>
		<td>글 제목 : ${bData.title}</td>
		<td>작성자 : ${bData.writer}</td>
		<td>글 내용 : ${bData.context}</td>
		<td><a href="main.do">메인으로</a></td>
	</tr>
	</table>
</body>
</html>