<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>sign up</h2>
	<form action="signUp.do" method="post">
		<table>
			<tbody>
				<tr>
					<td>ID</td>
					<td colspan="2"><input type="text" name="mid" required></td>
				</tr>
				<tr>
					<td>PASSWORD</td>
					<td colspan="2"><input type="password" name="mpw" required></td>
				</tr>
				<tr>
					<td>NAME</td>
					<td colspan="2"><input type="text" name="mname" required></td>
				</tr>
				
				<tr>
					<td>
					<input type="submit" value="SIGN UP">
					</td>
				</tr>
				<tr>
					<td>
					<a href="login.jsp">로그인 화면으로 돌아가기</a>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>