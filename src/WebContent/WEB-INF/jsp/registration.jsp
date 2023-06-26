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
<!-- ヘッダー -->
	<%@ include file="header.jsp" %>
<!-- 広告 -->
	<a url="">
		<img src="" alt="広告">
	</a>
<main>
<input type="hidden" id="getcheck1" value="${search.breakfast}">
<input type="hidden" id="getcheck2" value="${search.lunch}">
<input type="hidden" id="getcheck3" value="${search.dinner}">
<input type="hidden" id="getbf1" value="${search.snack}">
<input type="hidden" id="getbf2" value="${search.exercise}">
<input type="hidden" id="getbf3" value="${search.drink}">
<form method="POST" action="/sobaudon/RegistrationServlet" enctype="multipart/form-data" id="regi_form">
	<table class="regi_table">
		<tr>
			<th>朝</th>
			<td class="regi_check">
				<div class=bf_eat_st>
					<label><input id="reg_check1" type="checkbox" name="BF_SE_ST" value="1" class="check">主食</label>
					<label><input type='hidden' value='0' name='BF_SE_ST'></label>
				</div>
				<div class=bf_eat_ma>
					<label><input id="reg_check2" type="checkbox" name="BF_SE_MA" value="1" class="check">主菜</label>
					<label><input type='hidden' value="0" name="BF_SE_MA"></label>
				</div>
				<div class=bf_eat_si>
					<label><input id="reg_check3" type="checkbox" name="BF_SE_SI" value="1" class="check">副菜</label>
					<label><input type='hidden' value="0" name="BF_SE_SI"></label>
				</div>
				<div class=bf_eat_no>
					<label><input id="reg_check4" type="checkbox" name="BF_SE_NO" value="1" class="check">たべていない</label>
					<label><input type='hidden' value="0" name="BF_SE_NO"></label>
				</div>
				<div class=bf_eat_ot>
					<label><input id="reg_check5" type="checkbox" name="BF_SE_OT" value="1" class="check">その他</label><br>
					<label><input type='hidden' value="0" name="BF_SE_OT"></label>
				</div>
					<input class="eat_text" type="text" maxlength="100" name="BFTEXT" value="${search.bftext}">
			</td>
		</tr>
		<tr>
			<th>昼</th>
			<td class="regi_check">
				<div class=lc_eat_st>
					<label><input id="reg_check6" type="checkbox" name="LC_SE_ST" value="1" class="check">主食</label>
					<label><input type='hidden' value="0" name="LC_SE_ST"></label>
				</div>
				<div class=lc_eat_ma>
					<label><input id="reg_check7" type="checkbox" name="LC_SE_MA" value="1" class="check">主菜</label>
					<label><input type='hidden' value="0" name="LC_SE_MA"></label>
				</div>
				<div class=lc_eat_si>
					<label><input id="reg_check8" type="checkbox" name="LC_SE_SI" value="1" class="check">副菜</label>
					<label><input type='hidden' value="0" name="LC_SE_SI"></label>
				</div>
				<div class=lc_eat_no>
					<label><input id="reg_check9" type="checkbox" name="LC_SE_NO" value="1" class="check">たべていない</label>
					<label><input type='hidden' value="0" name="LC_SE_NO"></label>
				</div>
				<div class=lc_eat_ot>
					<label><input id="reg_check10" type="checkbox" name="LC_SE_OT" value="1" class="check">その他</label><br>
					<label><input type='hidden' value="0" name="LC_SE_OT"></label>
				</div>
					<input class="eat_text" type="text" maxlength="100" name="LCTEXT" value="${search.lctext}">
			</td>
		</tr>
		<tr>
			<th>夜</th>
			<td class="regi_check">
				<div class=dn_eat_st>
					<label><input id="reg_check11" type="checkbox" name="DN_SE_ST" value="1" class="check">主食</label>
					<label><input type='hidden' value="0" name="DN_SE_ST"></label>
				</div>
				<div class=dn_eat_ma>
					<label><input id="reg_check12" type="checkbox" name="DN_SE_MA" value="1" class="check">主菜</label>
					<label><input type='hidden' value="0" name="DN_SE_MA"></label>
				</div>
				<div class=dn_eat_si>
					<label><input id="reg_check13" type="checkbox" name="DN_SE_SI" value="1" class="check">副菜</label>
					<label><input type='hidden' value="0" name="DN_SE_SI"></label>
				</div>
				<div class=dn_eat_no>
					<label><input id="reg_check14" type="checkbox" name="DN_SE_NO" value="1" class="check">たべていない</label>
					<label><input type='hidden' value="0" name="DN_SE_NO"></label>
				</div>
				<div class=dn_eat_ot>
					<label><input id="reg_check15" type="checkbox" name="DN_SE_OT" value="1" class="check">その他</label><br>
					<label><input type='hidden' value="0" name="DN_SE_OT"></label>
				</div>
					<input class="eat_text" type="text" maxlength="100" name="DNTEXT" value="${search.dntext}">
			</td>
		</tr>

		<tr>
		<th>運動</th>
			<td>
				<label><input id="rd1" type="radio" name="EXERCISE" value="1">あり</label>
				<label><input id="rd2" type="radio" name="EXERCISE" value="0">なし</label>
			</td>
		<th>飲酒</th>
			<td>
				<label><input id="rd3" type="radio" name="DRINK" value="1">あり</label>
				<label><input id="rd4" type="radio" name="DRINK" value="0">なし</label>
			</td>
		<th>間食・夜食</th>
			<td>
				<label><input id="rd5" type="radio" name="SNACK" value="1">あり</label>
				<label><input id="rd6" type="radio" name="SNACK" value="0">なし</label>
			</td>
		</tr>

		<tr>
		<th>体重</th>
			<td>
				<input class="reg_text" type="text" name="DAYWEIGHT" value="${search.dayweight}">
			</td>
		<th>bmi</th>
			<td>
				<input class="reg_text" type="text" name="BMI" value="${search.bmi}" disabled>
			</td>
		<th>写真</th>
			<td>
				<input type="file" name="PICTURE" width="100" height="150">
			</td>
		</tr>
	</table>
	<input type="hidden" value="${search.date}" name="DATE">
	<input class="regi_submit" type="submit" name="submit" value="登録"><br>
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
		if(formObj_bf_eat1.value == "0" && formObj_bf_eat2.value == "0" && formObj_bf_eat3.value == "0" && formObj_bf_eat4.value == "0" && formObj_bf_eat5.value == "0"
			 && formObj_lc_eat1.value == "0" && formObj_lc_eat2.value == "0" && formObj_lc_eat3.value == "0" && formObj_lc_eat4.value == "0" && formObj_lc_eat5.value == "0"
			 && formObj_dn_eat1.value == "0" && formObj_dn_eat2.value == "0" && formObj_dn_eat3.value == "0" && formObj_dn_eat4.value == "0" && formObj_dn_eat5.value == "0"
		)
		{
			errorMessageObj.textContent = ' ※朝食,昼食,夕食のいずれかのチェックボックスの入力は必須です ';
			return false;
		}
		errorMessageObj.textContent = null;
	};
</script>
<script src="/sobaudon/js/registration.js"></script>
<!-- 称号 -->
	<%@ include file="title.jsp" %>
<!-- フッター -->
	<%@ include file="footer.jsp" %>
</body>
</html>