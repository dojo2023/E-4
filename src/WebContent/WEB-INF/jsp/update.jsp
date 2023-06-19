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
<header>
	<!-- ヘッダー（ここから） -->
	<h1 id="logo_login">
		ロゴ
	</h1>
	<h2>
		~さんの目標体重
	</h2>
	<h2 id="date"></h2>
	<a href="/sobaudon/LoginServlet">ログアウト</a>
	<ul>
		<li><a href="/sobaudon/RegistrationServlet">登録</a></li>
		<li><a href="/sobaudon/CalendarServlet">カレンダー</a></li>
		<li><a href="/sobaudon/SlideServlet">スライドショー</a></li>
		<li><a href="/sobaudon/BoardServlet">掲示板</a></li>
		<li><a href="/sobaudon/HelpServlet">ヘルプ</a></li>
		<li><a href="/sobaudon/ProfileServlet">プロフィール</a></li>
	</ul>
	<!-- ヘッダー（ここまで） -->
</header>
<!-- 広告 -->
	<a url="">
		<img src="" alt="広告">
	</a>
<main>
<form method="POST" action="/sobaudon/RegistrationServlet.java" enctype="multipart/form-data">
	<table class="update_table">
		<tr>
			<th>朝</th>
			<td>
				<input class="reg_check" type="checkbox" name="bf_select">
				<input class="reg_text" type="text" maxlength="100" name="bf_remarks">
			</td>
		</tr>
		<tr>
			<th>昼</th>
			<td>
				<input class="reg_check" type="checkbox" name="lu_select">
				<input class="reg_text" type="text" maxlength="100" name="lu_remarks">
			</td>
		</tr>
		<tr>
			<th>夜</th>
			<td>
				<input class="reg_check" type="checkbox" name="di_select">
				<input class="reg_text" type="text" maxlength="100" name="di_remarks">
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
</main>
</body>
</html>