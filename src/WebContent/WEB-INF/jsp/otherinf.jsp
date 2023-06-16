<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>きょうから | 他人情報</title>
	<!-- 登録っぽい系css挿入 -->
	<link rel="stylesheet" href="/sobaudon/WebContent/css/registration.css">
</head>
<body>
<form method="GET" action="/sobaudon/RegistrationServlet.java">
	<c:forEach var="other" items="${otherInfo}" >
	<table class="other_table">
		<tr>
			<th>朝</th>
			<td>
				朝食チェック<input type="checkbox" name="BF_SELECT" value="${other.bf_select}">
				朝食テキスト<input type="text" name="BF_TEXT" value="${other.bf_text}">
			</td>
		</tr>
		<tr>
			<th>昼</th>
			<td>
				昼食チェック<input type="checkbox" name="LU_SELECT" value="${other.lu_select}">
				昼食テキスト<input type="text" name="LU_TEXT" value="${other.lu_text}">
			</td>
		</tr>
		<tr>
			<th>夜</th>
			<td>
				夕食チェック<input type="checkbox" name="DI_SELECT" value="${other.di_select}">
				夕食テキスト<input type="text" name="DI_TEXT" value="${other.di_text}">
			</td>
		</tr>
		<tr>
			<td>
				運動<input type="radio" name="STRETCH" value="${other.stretch}">
			</td>
		</tr>
		<tr>
			<td>
				飲酒<input type="radio" name="DRINK" value="${other.drink}">
			</td>
		</tr>
		<tr>
			<td>
				間食<input type="radio" name="SNACK" value="${other.snack}">
			</td>
		</tr>
		<tr>
			<td>
				体重<input type="text" name="WEIGHT" value="${other.weight}">
			</td>
		</tr>
	</table>
	</c:forEach>
</form>
</body>
</html>