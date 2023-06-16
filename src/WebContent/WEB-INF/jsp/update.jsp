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
<form method="POST" action="/sobaudon/RegistrationServlet.java" enctype="multipart/form-data">
	<table class="update_table">
		<tr>
			<th>朝</th>
			<td>
				<input class="reg_check" type="checkbox" name="bf_select">
				<input class="reg_text" type="text" max_length="100" name="bf_remarks">
			</td>
		</tr>
		<tr>
			<th>昼</th>
			<td>
				<input class="reg_check" type="checkbox" name="lu_select">
				<input class="reg_text" type="text" max_length="100" name="lu_remarks">
			</td>
		</tr>
		<tr>
			<th>夜</th>
			<td>
				<input class="reg_check" type="checkbox" name="di_select">
				<input class="reg_text" type="text" max_length="100" name="di_remarks">
			</td>
		</tr>
		<tr>
			<td>
				運動
				<input class="reg_radio" type="radio" name="stretch">
			</td>
		</tr>
		<tr>
			<td>
				飲酒
				<input class="reg_radio" type="radio" name="drink">
			</td>
		</tr>
		<tr>
			<td>
				間食
				<input class="reg_radio" type="radio" name="snack">
			</td>
		</tr>
		<tr>
			<td>
				体重
				<input class="reg_text" type="text" name="weight">
				bmi

			</td>
		</tr>
		<tr>
			<td>
				写真
				<input class="reg_pic" type="file" name="picture">
			</td>
		</tr>
	</table>
	<input class="reg_submit" type="submit" name="submit" value="更新">
</form>
</body>
</html>