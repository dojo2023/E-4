<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>きょうから | 登録</title>
	<!-- 登録っぽい系css挿入 -->
	<link rel="stylesheet" href="/sobaudon/WebContent/css/registration.css">
</head>
<body>
<form method="POST" action="/sobaudon/RegistrationServlet.java" enctype="multipart/form-data">
	<table>
		<tr>
			<th>朝</th>
			<td>
				<label><input id="reg_check" type="checkbox" name="bf_select" value=staple>主食</label>
				<label><input id="reg_check" type="checkbox" name="bf_select" value=main>主菜</label>
				<label><input id="reg_check" type="checkbox" name="bf_select" value=side>副菜</label>
				<label><input id="reg_check" type="checkbox" name="bf_select" value=not_eat>たべていない</label>
				<label><input id="reg_check" type="checkbox" name="bf_select" value=other_eat>その他</label><br>
				<input class="reg_text" type="text" max_length="100" name="bf_remarks">
			</td>
		</tr>
		<tr>
			<th>昼</th>
			<td>
				<label><input id="reg_check" type="checkbox" name="lu_select" value=staple>主食</label>
				<label><input id="reg_check" type="checkbox" name="lu_select" value=main>主菜</label>
				<label><input id="reg_check" type="checkbox" name="lu_select" value=side>副菜</label>
				<label><input id="reg_check" type="checkbox" name="lu_select" value=not_eat>たべていない</label>
				<label><input id="reg_check" type="checkbox" name="lu_select" value=other_eat>その他</label><br>
				<input class="reg_text" type="text" max_length="100" name="lu_remarks">
			</td>
		</tr>
		<tr>
			<th>夜</th>
			<td>
				<label><input id="reg_check" type="checkbox" name="di_select" value=staple>主食</label>
				<label><input id="reg_check" type="checkbox" name="di_select" value=main>主菜</label>
				<label><input id="reg_check" type="checkbox" name="di_select" value=side>副菜</label>
				<label><input id="reg_check" type="checkbox" name="di_select" value=not_eat>たべていない</label>
				<label><input id="reg_check" type="checkbox" name="di_select" value=other_eat>その他</label><br>
				<input class="reg_text" type="text" max_length="100" name="di_remarks">
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">運動</p>
				<input id="reg_str1" type="radio" name="stretch" value="Yes">
				<label for="reg_str1">あり</label>
				<input id="reg_str2" type="radio" name="stretch" value="No">
				<label for="reg_str2">なし</label>
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">飲酒</p>
				<input id="reg_drink1" type="radio" name="drink" value="Yes">
				<label for="reg_drink1">あり</label>
				<input id="reg_drink2" type="radio" name="drink" value="No">
				<label for="reg_drink2">なし</label>
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">間食・夜食</p>
				<input id="reg_snc1" type="radio" name="drink" value="Yes">
				<label for="reg_snc1">あり</label>
				<input id="reg_snc2" type="radio" name="drink" value="No">
				<label for="reg_snc2">なし</label>
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">体重</p>
				<input class="reg_text" type="text" name="weight">
				<p class="registration_p">bmi</p>
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">写真</p>
				<input type="file" name="picture">
			</td>
		</tr>
	</table>
	<input class="reg_submit" type="submit" name="submit" value="登録">
</form>
</body>
</html>