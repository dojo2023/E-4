<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>きょうから | 他人情報</title>
	<!-- 登録っぽい系css挿入 -->
	<link rel="stylesheet" href="/sobaudon/css/registration.css">

	<!-- 他と違うtable用css -->
	<style>
		.ot_table_chuu {
			margin : 4px 20px 4px 300px ;
			display : block;
			white-space : nowrap;
			position : absolute;
			left :0px;
			top : 418px;
		}
		.ot_table_chuu th {
		width : 100px;
		text-align: center;
		}
		.ot_table_chuu td {
		width : 150px;
		text-align: center;
		border : 1px solid gray;
		}

		.ot_table_shita {
			margin : 4px 20px 4px 300px ;
			display : block;
			white-space : nowrap;
			position : absolute;
			left :312px;
			top : 418px;
		}
		.ot_table_shita th{
		width : 100px;
		text-align: center;
		}
		.ot_table_shita td{
		width : 150px;
		text-align: center;
		border : 1px solid gray;
		}
		/*（非活性）入力できない項目の色*/
		input[type=checkbox]:checked:disabled {
			background-color : white;
			color : inherit;
			cursor : not-allowed;
		}
		input[type=radio]:checked:disabled {
			background-color : white;
			color : inherit;
			cursor : not-allowed;
		}
		E:disabled{
		background : #fff;}

		.oth_name {
			position : relative;
			top : 2px;
			left: 56px;
		}

		body {
			background-color : #F6F5EA;
		}

		.ad_other {
			width:240px;
			height:500px;
			position:absolute;
			top:210px;
			left:20px;
			opacity:1;
		}
		.ad_other:hover{
			opacity:0.3;
		}
	</style>
</head>
<body>
<!-- ヘッダー -->
	<%@ include file="header.jsp" %>
<!-- 選択した日付 -->
	<div class="sele_date1">${search.date}</div>
	<div class="sele_date2">${date}</div>
<!-- ~~さんの情報 -->
	<div class="oth_name">
		<span>${name2}さんの情報</span>
	</div>
<!-- 広告 -->
	<a href="https://www.seplus.jp/" target="_blank">
		<img src="./img/advplusdojo.png" alt="広告" class="ad_other">
	</a>

<main>

<input type="hidden" id="getcheck1" value="${search.breakfast}">
<input type="hidden" id="getcheck2" value="${search.lunch}">
<input type="hidden" id="getcheck3" value="${search.dinner}">
<input type="hidden" id="getbf1" value="${search.snack}">
<input type="hidden" id="getbf2" value="${search.exercise}">
<input type="hidden" id="getbf3" value="${search.drink}">

<form method="GET" action="/sobaudon/RegistrationServlet.java">
	<table class="table_ue">
		<tr>
			<th>朝</th>
			<td class="regi_check1">
				<label><input id="reg_check1" type="checkbox" name="BF_SE_ST" value="1" class="check" disabled>主食</label>
				<label><input type='hidden' value='0' name='BF_SE_ST' disabled></label>

				<label><input id="reg_check2" type="checkbox" name="BF_SE_MA" value="1" class="check" disabled>主菜</label>
				<label><input type='hidden' value="0" name="BF_SE_MA" disabled></label>

				<label><input id="reg_check3" type="checkbox" name="BF_SE_SI" value="1" class="check" disabled>副菜</label>
				<label><input type='hidden' value="0" name="BF_SE_SI" disabled></label>

				<label><input id="reg_check4" type="checkbox" name="BF_SE_NO" value="1" class="check" disabled>たべていない</label>
				<label><input type='hidden' value="0" name="BF_SE_NO" disabled></label>

				<label><input id="reg_check5" type="checkbox" name="BF_SE_OT" value="1" class="check" disabled>その他</label><br>
				<label><input type='hidden' value="0" name="BF_SE_OT" disabled></label>

				<input class="eat_text1" type="text" maxlength="100" name="BFTEXT" value="${search.bftext}" disabled>
			</td>
		</tr>
		<tr>
			<th>昼</th>
			<td class="regi_check2">
				<label><input id="reg_check6" type="checkbox" name="LC_SE_ST" value="1" class="check" disabled>主食</label>
				<label><input type='hidden' value="0" name="LC_SE_ST" disabled></label>

				<label><input id="reg_check7" type="checkbox" name="LC_SE_MA" value="1" class="check" disabled>主菜</label>
				<label><input type='hidden' value="0" name="LC_SE_MA" disabled></label>

				<label><input id="reg_check8" type="checkbox" name="LC_SE_SI" value="1" class="check" disabled>副菜</label>
				<label><input type='hidden' value="0" name="LC_SE_SI" disabled></label>

				<label><input id="reg_check9" type="checkbox" name="LC_SE_NO" value="1" class="check" disabled>たべていない</label>
				<label><input type='hidden' value="0" name="LC_SE_NO" disabled></label>

				<label><input id="reg_check10" type="checkbox" name="LC_SE_OT" value="1" class="check" disabled>その他</label><br>
				<label><input type='hidden' value="0" name="LC_SE_OT" disabled></label>

				<input class="eat_text2" type="text" maxlength="100" name="LCTEXT" value="${search.lctext}" disabled>
			</td>
		</tr>
		<tr>
			<th>夜</th>
			<td class="regi_check3">
				<label><input id="reg_check11" type="checkbox" name="DN_SE_ST" value="1" class="check" disabled>主食</label>
				<label><input type='hidden' value="0" name="DN_SE_ST" disabled></label>

				<label><input id="reg_check12" type="checkbox" name="DN_SE_MA" value="1" class="check" disabled>主菜</label>
				<label><input type='hidden' value="0" name="DN_SE_MA" disabled></label>

				<label><input id="reg_check13" type="checkbox" name="DN_SE_SI" value="1" class="check" disabled>副菜</label>
				<label><input type='hidden' value="0" name="DN_SE_SI" disabled></label>

				<label><input id="reg_check14" type="checkbox" name="DN_SE_NO" value="1" class="check" disabled>たべていない</label>
				<label><input type='hidden' value="0" name="DN_SE_NO" disabled></label>

				<label><input id="reg_check15" type="checkbox" name="DN_SE_OT" value="1" class="check" disabled>その他</label><br>
				<label><input type='hidden' value="0" name="DN_SE_OT" disabled></label>

				<input class="eat_text3" type="text" maxlength="100" name="DNTEXT" value="${search.dntext}" disabled>
			</td>
		</tr>
	</table>

	<table class="ot_table_chuu">
		<tr>
			<th>運動</th>
				<td>
					<label><input id="rd1" type="radio" name="EXERCISE" value="1" disabled>あり</label>
					<label><input id="rd2" type="radio" name="EXERCISE" value="0" disabled>なし</label>
				</td>
		</tr>
		<tr>
			<th>飲酒</th>
				<td>
					<label><input id="rd3" type="radio" name="DRINK" value="1" disabled>あり</label>
					<label><input id="rd4" type="radio" name="DRINK" value="0" disabled>なし</label>
				</td>
		</tr>
	</table>

	<table class="ot_table_shita">
		<tr>
			<th>間食・夜食</th>
				<td>
					<label><input id="rd5" type="radio" name="SNACK" value="1" disabled>あり</label>
					<label><input id="rd6" type="radio" name="SNACK" value="0" disabled>なし</label>
				</td>
		</tr>
		<tr>
			<th>体重</th>
				<td>
					<input class="reg_text" type="text" name="DAYWEIGHT" value="${search.dayweight}" disabled>
				</td>
		</tr>
	</table>
	<input type="hidden" value="${search.date}" name="DATE1">
	<input type="hidden" value="${date}" name="DATE2">
</form>
</main>
<script src="/sobaudon/js/otherinf.js"></script>
<!-- 称号 -->
	<%@ include file="title.jsp" %>
<!-- 前回の称号 -->
	<!-- <div class="achivement">前回の称号</div> -->
<!-- フッター -->
	<%@ include file="footer.jsp" %>
</body>
</html>