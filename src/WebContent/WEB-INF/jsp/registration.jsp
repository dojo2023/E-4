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
<!-- 選択した日付 -->
	<div class="sele_date1">${search.date}</div>
	<div class="sele_date2">${date}</div>
<!-- 広告 -->
	<a href="https://www.seplus.jp/" target="_blank">
		<img src="./img/adv.png" alt="広告" class="ad">
	</a>

<main>
<input type="hidden" id="getcheck1" value="${search.breakfast}">
<input type="hidden" id="getcheck2" value="${search.lunch}">
<input type="hidden" id="getcheck3" value="${search.dinner}">
<input type="hidden" id="getbf1" value="${search.snack}">
<input type="hidden" id="getbf2" value="${search.exercise}">
<input type="hidden" id="getbf3" value="${search.drink}">
<form method="POST" action="/sobaudon/RegistrationServlet" enctype="multipart/form-data" id="regi_form">

	<table class="table_ue">
		<tr>
			<th>朝</th>
			<td class="regi_check1">
				<label><input id="reg_check1" type="checkbox" name="BF_SE_ST" value="1" class="check">主食</label>
				<label><input type='hidden' value='0' name='BF_SE_ST'></label>

				<label><input id="reg_check2" type="checkbox" name="BF_SE_MA" value="1" class="check">主菜</label>
				<label><input type='hidden' value="0" name="BF_SE_MA"></label>

				<label><input id="reg_check3" type="checkbox" name="BF_SE_SI" value="1" class="check">副菜</label>
				<label><input type='hidden' value="0" name="BF_SE_SI"></label>

				<label><input id="reg_check4" type="checkbox" name="BF_SE_NO" value="1" class="check">たべていない</label>
				<label><input type='hidden' value="0" name="BF_SE_NO"></label>

				<label><input id="reg_check5" type="checkbox" name="BF_SE_OT" value="1" class="check">その他</label><br>
				<label><input type='hidden' value="0" name="BF_SE_OT"></label>

				<input class="eat_text1" type="text" maxlength="100" name="BFTEXT" value="${search.bftext}">
			</td>
		</tr>
		<tr>
			<th>昼</th>
			<td class="regi_check2">
				<label><input id="reg_check6" type="checkbox" name="LC_SE_ST" value="1" class="check">主食</label>
				<label><input type='hidden' value="0" name="LC_SE_ST"></label>

				<label><input id="reg_check7" type="checkbox" name="LC_SE_MA" value="1" class="check">主菜</label>
				<label><input type='hidden' value="0" name="LC_SE_MA"></label>

				<label><input id="reg_check8" type="checkbox" name="LC_SE_SI" value="1" class="check">副菜</label>
				<label><input type='hidden' value="0" name="LC_SE_SI"></label>

				<label><input id="reg_check9" type="checkbox" name="LC_SE_NO" value="1" class="check">たべていない</label>
				<label><input type='hidden' value="0" name="LC_SE_NO"></label>

				<label><input id="reg_check10" type="checkbox" name="LC_SE_OT" value="1" class="check">その他</label><br>
				<label><input type='hidden' value="0" name="LC_SE_OT"></label>

				<input class="eat_text2" type="text" maxlength="100" name="LCTEXT" value="${search.lctext}">
			</td>
		</tr>
		<tr>
			<th>夜</th>
			<td class="regi_check3">
				<label><input id="reg_check11" type="checkbox" name="DN_SE_ST" value="1" class="check">主食</label>
				<label><input type='hidden' value="0" name="DN_SE_ST"></label>

				<label><input id="reg_check12" type="checkbox" name="DN_SE_MA" value="1" class="check">主菜</label>
				<label><input type='hidden' value="0" name="DN_SE_MA"></label>

				<label><input id="reg_check13" type="checkbox" name="DN_SE_SI" value="1" class="check">副菜</label>
				<label><input type='hidden' value="0" name="DN_SE_SI"></label>

				<label><input id="reg_check14" type="checkbox" name="DN_SE_NO" value="1" class="check">たべていない</label>
				<label><input type='hidden' value="0" name="DN_SE_NO"></label>

				<label><input id="reg_check15" type="checkbox" name="DN_SE_OT" value="1" class="check">その他</label><br>
				<label><input type='hidden' value="0" name="DN_SE_OT"></label>

				<input class="eat_text3" type="text" maxlength="100" name="DNTEXT" value="${search.dntext}">
			</td>
		</tr>
	</table>

	<table class="table_chuu">
		<tr>
			<th>運動</th>
				<td>
					<label><input id="rd1" type="radio" name="EXERCISE" value="1">あり</label>
					<label><input id="rd2" type="radio" name="EXERCISE" value="0">なし</label>
				</td>
		</tr>
		<tr>
			<th>飲酒</th>
				<td>
					<label><input id="rd3" type="radio" name="DRINK" value="1">あり</label>
					<label><input id="rd4" type="radio" name="DRINK" value="0">なし</label>
				</td>
		</tr>
		<tr>
			<th>間食・夜食</th>
				<td>
					<label><input id="rd5" type="radio" name="SNACK" value="1">あり</label>
					<label><input id="rd6" type="radio" name="SNACK" value="0">なし</label>
				</td>
		</tr>
	</table>

	<table class="table_shita">
		<tr>
			<th>体重</th>
				<td>
					<input class="reg_text" type="text" name="DAYWEIGHT" value="${search.dayweight}">
				</td>
		</tr>
		<tr>
			<th>bmi</th>
				<td>
					<input class="reg_text" type="text" name="BMI" value="${search.bmi}" disabled>
				</td>
		</tr>
	</table>

	<table class="table_picture">
		<tr>
			<th>写真</th>
				<td>
					<input type="file" name="PICTURE" width="100" height="150">
				</td>
		</tr>
	</table>
	<!-- <input type="hidden" value="${search.date}" name="DATE"> -->
	<input type="hidden" value="${search.date}" name="DATE1">
	<input type="hidden" value="${date}" name="DATE2">
	<input class="regi_submit" type="submit" name="submit" value="登録"><br>
	<div>
		<span id="error_message"></span>
	</div>
</form>
</main>
<script>
	var regiObj = document.getElementById('regi_form');
	var errorMessageObj = document.getElementById('error_message');

	let str1 = st1.charAt(0);
	let str2 = st1.charAt(1);
	let str3 = st1.charAt(2);
	let str4 = st1.charAt(3);
	let str5 = st1.charAt(4);
	let str6 = st2.charAt(0);
	let str7 = st2.charAt(1);
	let str8 = st2.charAt(2);
	let str9 = st2.charAt(3);
	let str10 = st2.charAt(4);
	let str11 = st3.charAt(0);
	let str12 = st3.charAt(1);
	let str13 = st3.charAt(2);
	let str14 = st3.charAt(3);
	let str15 = st3.charAt(4);
/*
	regiObj.onsubmit = function() {
		if(formObj_bf_eat1.value == "0" && formObj_bf_eat2.value == "0" && formObj_bf_eat3.value == "0" && formObj_bf_eat4.value == "0" && formObj_bf_eat5.value == "0"
			 && formObj_lc_eat1.value == "0" && formObj_lc_eat2.value == "0" && formObj_lc_eat3.value == "0" && formObj_lc_eat4.value == "0" && formObj_lc_eat5.value == "0"
			 && formObj_dn_eat1.value == "0" && formObj_dn_eat2.value == "0" && formObj_dn_eat3.value == "0" && formObj_dn_eat4.value == "0" && formObj_dn_eat5.value == "0"
		)
		{
			errorMessageObj.textContent = ' ※朝食,昼食,夕食のいずれかのチェックボックスの入力は必須です ';
			return false;
		}
*/
	regiObj.onsubmit = function(){
		if (str1 != '1' && str2 != '1' && str3 != '1' && str4 != '1' && str5 != '1'
				&& str6 != '1' && str7 != '1' && str8 != '1' && str9 != '1' && str10 != '1'
				&& str11 != '1' && str12 != '1' && str13 != '1' && str14 != '1' && str15 != '1'
			) {
			errorMessageObj.textContent = ' ※朝食,昼食,夕食のいずれかのチェックボックスの入力は必須です ';
			return false;
		}
		errorMessageObj.textContent = null;
	}
</script>
<script src="/sobaudon/js/registration.js"></script>
<!-- 称号 -->
	<%@ include file="title.jsp" %>
<!-- フッター -->
	<%@ include file="footer.jsp" %>
</body>
</html>