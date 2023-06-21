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
<!-- 選択した日付 -->
	<div >選択した日付</div>
<!-- ~~さんの情報 -->
	<div>[nickname]さんの情報</div>
<!-- 広告 -->
	<a url="">
		<img src="" alt="広告">
	</a>
<!-- 称号 -->
	<div class="achivement">称号</div>
<main>
<form method="GET" action="/sobaudon/RegistrationServlet.java">
<c:forEach var="other" items="${otherInfo}" >
	<table>
		<tr>
			<th>朝</th>
			<td><label><input type='hidden' value="0" name="BF_SE_ST" disabled></label>
				<label><input id="reg_check" type="checkbox" name="BF_SE_ST" value="1" disabled>主食</label>
				<label><input type='hidden' value="0" name="BF_SE_MA" disabled></label>
				<label><input id="reg_check" type="checkbox" name="BF_SE_MA" value="1" disabled>主菜</label>
				<label><input type='hidden' value="0" name="BF_SE_SI" disabled></label>
				<label><input id="reg_check" type="checkbox" name="BF_SE_SI" value="1" disabled>副菜</label>
				<label><input type='hidden' value="0" name="BF_SE_NO" disabled></label>
				<label><input id="reg_check" type="checkbox" name="BF_SE_NO" value="1" disabled>たべていない</label>
				<label><input type='hidden' value="0" name="BF_SE_OT" disabled></label>
				<label><input id="reg_check" type="checkbox" name="BF_SE_OT" value="1" disabled>その他</label><br>
				<input class="reg_text" type="text" maxlength="100" name="BFTEXT" disabled>
			</td>
		</tr>
		<tr>
			<th>昼</th>
			<td>
				<label><input type='hidden' value="0" name="LC_SE_ST" disabled></label>
				<label><input id="reg_check" type="checkbox" name="LC_SE_ST" value="1" disabled>主食</label>
				<label><input type='hidden' value="0" name="LC_SE_MA" disabled></label>
				<label><input id="reg_check" type="checkbox" name="LC_SE_MA" value="1" disabled>主菜</label>
				<label><input type='hidden' value="0" name="LC_SE_SI" disabled></label>
				<label><input id="reg_check" type="checkbox" name="LC_SE_SI" value="1" disabled>副菜</label>
				<label><input type='hidden' value="0" name="LC_SE_NO" disabled></label>
				<label><input id="reg_check" type="checkbox" name="LC_SE_NO" value="1" disabled>たべていない</label>
				<label><input type='hidden' value="0" name="LC_SE_OT" disabled></label>
				<label><input id="reg_check" type="checkbox" name="LC_SE_OT" value="1" disabled>その他</label><br>
				<input class="reg_text" type="text" maxlength="100" name="LCTEXT" disabled>
			</td>
		</tr>
		<tr>
			<th>夜</th>
			<td>
				<label><input type='hidden' value="0" name="DN_SE_ST" disabled></label>
				<label><input id="reg_check" type="checkbox" name="DN_SE_ST" value="1" disabled>主食</label>
				<label><input type='hidden' value="0" name="DN_SE_MA" disabled></label>
				<label><input id="reg_check" type="checkbox" name="DN_SE_MA" value="1" disabled>主菜</label>
				<label><input type='hidden' value="0" name="DN_SE_SI" disabled></label>
				<label><input id="reg_check" type="checkbox" name="DN_SE_SI" value="1" disabled>副菜</label>
				<label><input type='hidden' value="0" name="DN_SE_NO" disabled></label>
				<label><input id="reg_check" type="checkbox" name="DN_SE_NO" value="1" disabled>たべていない</label>
				<label><input type='hidden' value="0" name="DN_SE_OT" disabled></label>
				<label><input id="reg_check" type="checkbox" name="DN_SE_OT" value="1" disabled>その他</label><br>
				<input class="reg_text" type="text" maxlength="100" name="DNTEXT" disabled>
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">運動</p>
				<label><input type="radio" name="EXERCISE" value="0" disabled>あり</label>
				<label><input type="radio" name="EXERCISE" value="1" disabled>なし</label>
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">飲酒</p>
				<label><input type="radio" name="DRINK" value="0" disabled>あり</label>
				<label><input type="radio" name="DRINK" value="1" disabled>なし</label>
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">間食・夜食</p>
				<label><input type="radio" name="SNACK" value="0" disabled>あり</label>
				<label><input type="radio" name="SNACK" value="1" disabled>なし</label>
			</td>
		</tr>
		<tr>
			<td>
				<p class="registration_p">体重</p>
				<input class="reg_text" type="text" name="DAYWEIGHT" disabled>
				<p class="registration_p">bmi</p>
			</td>
		</tr>
	</table>
</c:forEach>
</form>
<!-- 称号 -->
	<div class="achivement">称号</div>
</main>
</body>
</html>