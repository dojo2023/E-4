<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" type="text/css" href="/sobaudon//WebContent/css/board.css">
<script type="text/javascript">

function check(){
    var flag = 0;

    if(document.form1.Chattext.value == ""){
        flag = 1;
    }

    if(flag){
        window.alert('コメントを入力してください'); 
        return false; // 送信を中止
    }
    else{
        return true; // 送信を実行
    }
    
}
</script>

<title>掲示板</title>
</head>
<body>
<form action="/servlet/BoardServlet" method="post" name="form1" onSubmit="return check()">
<p>コメント:<br>
<textarea name="chattext" rows="5" cols="40"></textarea>
</p>
<p><input type="submit" value="送信"><input type="reset" value="リセット">
</p>
</form>

<c:forEach var="list" items="${listAttribute}">
<p>名前:<c:out value="${list.name}"/>　訪問数:<c:out value="${list.visiter}"/>　
日付:<c:out value="${list.time}"/>　<br>投稿内容:<c:out value="${list.chattext}"/>　</p>
</c:forEach>

<div class="title">
	<table>
		<tr>
		<td id="tn">レジェンド</td>
		<td rowspan="2"><img src="./img/titletest.png"></td>
		</tr>
		<tr>
		<td id="tl">pt</td>
		</tr>
	</table>
</div>
</body>
</html>
