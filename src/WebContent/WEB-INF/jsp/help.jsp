<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>きょうから｜ヘルプ</title>
<link rel="stylesheet" href="/sobaudon/css/help.css">
</head>
<body>
<%@ include file="header.jsp" %>
<div class="main">
<h1>登録</h1>
	登録時は各三食をとった際、チェックボックスにて何の種を食べたか等の記入をしてください。<br>
	食べたものの詳細はテキスト内に記入ください。テキストは必須ではないのでチェックのみでも登録できます。<br>
	運動・飲酒・間食等は有無を記録できます。<br>
	一日四食とる方は間食ありにする、または三食のテキスト内に記入するなどの工夫をお願い致します。<br>
	体重はその日の体重を記録します。数字で記入してください。<br>
	BMIは入力された体重から自動計算されます。<br>
	写真は日々の自身の体を記録します。<br>

<h2>ランク制度</h2>
	ランクは下から、<br>
	　　　　　怠惰(0-3pt)
	　　　　　　怠け者(4-13pt)
	　　　　　一般人(14-27pt)<br>
	　　　　エリート(28-55pt)
	　　　　　プロ(56-84pt)
	　　　　　レジェンド(85-pt)<br>
	となっています。<br>
	ポイントは一日一回登録した際に 1pt 獲得が可能であり、毎日am.3:00に更新されます。<br>
	更新時に登録がなかった場合 -3pt されます。<br>
	ランクは３か月ごとに更新され、更新後に全員が 0pt からのスタートとなります。<br>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>