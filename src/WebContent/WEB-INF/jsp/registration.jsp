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
	<table>
		<tr>
			<th>朝</th>
			<td>
				<label><input id="reg_check" type="checkbox" name="bf_select" value=staple>主食</label>
				<label><input id="reg_check" type="checkbox" name="bf_select" value=main>主菜</label>
				<label><input id="reg_check" type="checkbox" name="bf_select" value=side>副菜</label>
				<label><input id="reg_check" type="checkbox" name="bf_select" value=not_eat>たべていない</label>
				<label><input id="reg_check" type="checkbox" name="bf_select" value=other_eat>その他</label><br>
				<input class="reg_text" type="text" maxlength="100" name="bf_remarks">
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
				<input class="reg_text" type="text" maxlength="100" name="lu_remarks">
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
				<input class="reg_text" type="text" maxlength="100" name="di_remarks">
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">運動</p>
				<label><input type="radio" name="stretch" value="Yes">あり</label>
				<label><input type="radio" name="stretch" value="No">なし</label>

			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">飲酒</p>
				<label><input type="radio" name="drink" value="Yes">あり</label>
				<label><input type="radio" name="drink" value="No">なし</label>
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">間食・夜食</p>
				<label><input type="radio" name="snack" value="Yes">あり</label>
				<label><input type="radio" name="snack" value="No">なし</label>
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
</main>
</body>
</html>