<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>きょうから | 登録</title>
	<!-- 登録っぽい系css挿入 -->
	<link rel="stylesheet" href="/sobaudon/css/registration.css">
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
<!-- 称号 -->
	<div class="achivement">称号</div>
<img src="C:\pleiades\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\sobaudon\body\小嶋駿也_typing_0516.png">
<main>
<form method="POST" action="/sobaudon/RegistrationServlet" enctype="multipart/form-data" id="regi_form">
	<table class="regi_table">
		<tr>
			<th>朝</th>
			<td>
				<div class=bf_eat_st>
					<label><input type='hidden' value='0' name='BF_SE_ST'></label>
					<label><input id="reg_check" type="checkbox" name="BF_SE_ST" value="1" class="check">主食</label>
				</div>
				<div class=bf_eat_ma>
					<label><input type='hidden' value="0" name="BF_SE_MA"></label>
					<label><input id="reg_check" type="checkbox" name="BF_SE_MA" value="1" class="check">主菜</label>
				</div>
				<div class=bf_eat_si>
					<label><input type='hidden' value="0" name="BF_SE_SI"></label>
					<label><input id="reg_check" type="checkbox" name="BF_SE_SI" value="1" class="check">副菜</label>
				</div>
				<div class=bf_eat_no>
					<label><input type='hidden' value="0" name="BF_SE_NO"></label>
					<label><input id="reg_check" type="checkbox" name="BF_SE_NO" value="1" class="check">たべていない</label>
				</div>
				<div class=bf_eat_ot>
					<label><input type='hidden' value="0" name="BF_SE_OT"></label>
					<label><input id="reg_check" type="checkbox" name="BF_SE_OT" value="1" class="check">その他</label><br>
				</div>
					<input class="eat_text" type="text" maxlength="100" name="BFTEXT">
			</td>
		</tr>
		<tr>
			<th>昼</th>
			<td>
				<div class=lc_eat_st>
					<label><input type='hidden' value="0" name="LC_SE_ST"></label>
					<label><input id="reg_check" type="checkbox" name="LC_SE_ST" value="1" class="check">主食</label>
				</div>
				<div class=lc_eat_ma>
					<label><input type='hidden' value="0" name="LC_SE_MA"></label>
					<label><input id="reg_check" type="checkbox" name="LC_SE_MA" value="1" class="check">主菜</label>
				</div>
				<div class=lc_eat_si>
					<label><input type='hidden' value="0" name="LC_SE_SI"></label>
					<label><input id="reg_check" type="checkbox" name="LC_SE_SI" value="1" class="check">副菜</label>
				</div>
				<div class=lc_eat_no>
					<label><input type='hidden' value="0" name="LC_SE_NO"></label>
					<label><input id="reg_check" type="checkbox" name="LC_SE_NO" value="1" class="check">たべていない</label>
				</div>
				<div class=lc_eat_ot>
					<label><input type='hidden' value="0" name="LC_SE_OT"></label>
					<label><input id="reg_check" type="checkbox" name="LC_SE_OT" value="1" class="check">その他</label><br>
				</div>
					<input class="eat_text" type="text" maxlength="100" name="LCTEXT">
			</td>
		</tr>
		<tr>
			<th>夜</th>
			<td>
				<div class=dn_eat_st>
					<label><input type='hidden' value="0" name="DN_SE_ST"></label>
					<label><input id="reg_check" type="checkbox" name="DN_SE_ST" value="1" class="check">主食</label>
				</div>
				<div class=dn_eat_ma>
					<label><input type='hidden' value="0" name="DN_SE_MA"></label>
					<label><input id="reg_check" type="checkbox" name="DN_SE_MA" value="1" class="check">主菜</label>
				</div>
				<div class=dn_eat_si>
					<label><input type='hidden' value="0" name="DN_SE_SI"></label>
					<label><input id="reg_check" type="checkbox" name="DN_SE_SI" value="1" class="check">副菜</label>
				</div>
				<div class=dn_eat_no>
					<label><input type='hidden' value="0" name="DN_SE_NO"></label>
					<label><input id="reg_check" type="checkbox" name="DN_SE_NO" value="1" class="check">たべていない</label>
				</div>
				<div class=dn_eat_ot>
					<label><input type='hidden' value="0" name="DN_SE_OT"></label>
					<label><input id="reg_check" type="checkbox" name="DN_SE_OT" value="1" class="check">その他</label><br>
				</div>
					<input class="eat_text" type="text" maxlength="100" name="DNTEXT">
			</td>
		</tr>

		<tr>
		<th>運動</th>
			<td>
				<label><input type="radio" name="EXERCISE" value="1">あり</label>
				<label><input type="radio" name="EXERCISE" value="0">なし</label>
			</td>
		<th>飲酒</th>
			<td>
				<label><input type="radio" name="DRINK" value="1">あり</label>
				<label><input type="radio" name="DRINK" value="0">なし</label>
			</td>
		<th>間食・夜食</th>
			<td>
				<label><input type="radio" name="SNACK" value="1">あり</label>
				<label><input type="radio" name="SNACK" value="0">なし</label>
			</td>
		</tr>

		<tr>
		<th>体重</th>
			<td>
				<input class="reg_text" type="text" name="DAYWEIGHT">
			</td>
		<th>bmi</th>
			<td>
				<input class="reg_text" type="text" name="BMI" disabled>
			</td>
		<th>写真</th>
			<td>
				<input type="file" name="PICTURE" width="100" height="150">
			</td>
		</tr>
	</table>
	<input class="reg_submit" type="submit" name="submit" value="登録"><br>
	<div>
		<span id="error_message"></span>
	</div>
</form>
</main>
<script>
	var regiObj = document.getElementById('regi_form');

	var formObj_bf_eat1 = document.getElementById('bf_eat_st');
	var formObj_bf_eat2 = document.getElementById('bf_eat_ma');
	var formObj_bf_eat3 = document.getElementById('bf_eat_si');
	var formObj_bf_eat4 = document.getElementById('bf_eat_no');
	var formObj_bf_eat5 = document.getElementById('bf_eat_ot');

	var formObj_lc_eat1 = document.getElementById('lc_eat_st');
	var formObj_lc_eat2 = document.getElementById('lc_eat_ma');
	var formObj_lc_eat3 = document.getElementById('lc_eat_si');
	var formObj_lc_eat4 = document.getElementById('lc_eat_no');
	var formObj_lc_eat5 = document.getElementById('lc_eat_ot');

	var formObj_dn_eat1 = document.getElementById('dn_eat_st');
	var formObj_dn_eat2 = document.getElementById('dn_eat_ma');
	var formObj_dn_eat3 = document.getElementById('dn_eat_si');
	var formObj_dn_eat4 = document.getElementById('dn_eat_no');
	var formObj_dn_eat5 = document.getElementById('dn_eat_ot');

	var errorMessageObj = document.getElementById('error_message');

	regiObj.onsubmit = function() {
		if (formObj_bf_eat1.value == 0 || formObj_bf_eat2.value == 0 || formObj_bf_eat3.value == 0 || formObj_bf_eat4.value == 0 || formObj_bf_eat5.value == 0
			 || formObj_lc_eat1.value == 0 || formObj_lc_eat2.value == 0 || formObj_lc_eat3.value == 0 || formObj_lc_eat4.value == 0 || formObj_lc_eat5.value == 0
			 || formObj_dn_eat1.value == 0 || formObj_dn_eat2.value == 0 || formObj_dn_eat3.value == 0 || formObj_dn_eat4.value == 0 || formObj_dn_eat5.value == 0) {
			errorMessageObj.textContent = ' ※朝食,昼食,夕食のいずれかのチェックボックスの入力は必須です ';
			return false;
		}
		errorMessageObj.textContent = null;
	};
</script>
</body>
</html>