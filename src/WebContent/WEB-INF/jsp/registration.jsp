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
<form method="POST" action="/sobaudon/RegistrationServlet" enctype="multipart/form-data">
	<table>
		<tr>
			<th>朝</th>
			<td><label><input type='hidden' value="0" name="bf_se_st"></label>
				<label><input id="reg_check" type="checkbox" name="bf_se_st" value="1">主食</label>
				<label><input type='hidden' value="0" name="bf_se_ma"></label>
				<label><input id="reg_check" type="checkbox" name="bf_se_ma" value="1">主菜</label>
				<label><input type='hidden' value="0" name="bf_se_si"></label>
				<label><input id="reg_check" type="checkbox" name="bf_se_si" value="1">副菜</label>
				<label><input type='hidden' value="0" name="bf_se_no"></label>
				<label><input id="reg_check" type="checkbox" name="bf_se_no" value="1">たべていない</label>
				<label><input type='hidden' value="0" name="bf_se_ot"></label>
				<label><input id="reg_check" type="checkbox" name="bf_se_ot" value="1">その他</label><br>
				<input class="reg_text" type="text" maxlength="100" name="bftext">
			</td>
		</tr>
		<tr>
			<th>昼</th>
			<td>
				<label><input type='hidden' value="0" name="lc_se_st"></label>
				<label><input id="reg_check" type="checkbox" name="lc_se_st" value="1">主食</label>
				<label><input type='hidden' value="0" name="lc_se_ma"></label>
				<label><input id="reg_check" type="checkbox" name="lc_se_ma" value="1">主菜</label>
				<label><input type='hidden' value="0" name="lc_se_si"></label>
				<label><input id="reg_check" type="checkbox" name="lc_se_si" value="1">副菜</label>
				<label><input type='hidden' value="0" name="lc_se_no"></label>
				<label><input id="reg_check" type="checkbox" name="lc_se_no" value="1">たべていない</label>
				<label><input type='hidden' value="0" name="lc_se_ot"></label>
				<label><input id="reg_check" type="checkbox" name="lc_se_ot" value="1">その他</label><br>
				<input class="reg_text" type="text" maxlength="100" name="lctext">
			</td>
		</tr>
		<tr>
			<th>夜</th>
			<td>
				<label><input type='hidden' value="0" name="dn_se_st"></label>
				<label><input id="reg_check" type="checkbox" name="dn_se_st" value="1">主食</label>
				<label><input type='hidden' value="0" name="dn_se_ma"></label>
				<label><input id="reg_check" type="checkbox" name="dn_se_ma" value="1">主菜</label>
				<label><input type='hidden' value="0" name="dn_se_si"></label>
				<label><input id="reg_check" type="checkbox" name="dn_se_si" value="1">副菜</label>
				<label><input type='hidden' value="0" name="dn_se_no"></label>
				<label><input id="reg_check" type="checkbox" name="dn_se_no" value="1">たべていない</label>
				<label><input type='hidden' value="0" name="dn_se_ot"></label>
				<label><input id="reg_check" type="checkbox" name="dn_se_ot" value="1">その他</label><br>
				<input class="reg_text" type="text" maxlength="100" name="dntext">
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">運動</p>
				<label><input type="radio" name="EXERCISE" value="0">あり</label>
				<label><input type="radio" name="EXERCISE" value="1">なし</label>

			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">飲酒</p>
				<label><input type="radio" name="drink" value="0">あり</label>
				<label><input type="radio" name="drink" value="1">なし</label>
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">間食・夜食</p>
				<label><input type="radio" name="snack" value="0">あり</label>
				<label><input type="radio" name="snack" value="1">なし</label>
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