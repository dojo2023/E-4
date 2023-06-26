<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>掲示板</title>
<link rel="stylesheet" type="text/css" href="/sobaudon/css/board.css">
</head>
<body class = "txt">
<%@ include file="header.jsp" %>
<c:forEach var="e" items="${list}" >
<form action = "<%= request.getContextPath() %>/BrowseServlet" method="post">
<input class="data" type="hidden" name= "USER_ID" value="${e.user_id}">
<input value="ニックネーム:${e.name}" type = "submit" name = "submit"> 
</form><br>
<c:out value="${e.date}"></c:out>　投稿内容:<c:out value="${e.chattext}"></c:out><br>
 
<br>
<br>
</c:forEach>


<form action="/sobaudon/BoardServlet" method="post" name="form1"> <!-- onSubmit="return check()" -->
<div class = "rw">
<p class = "chat">コメント:<br>
<textarea name="chattext" rows="5" cols="40" minlength="1" onkeyup = "ShowLength(value)"required placeholder="文字を入力してください。"onChange="check()"></textarea>
</p>
<p id = "inputlength">0文字</p>
<p class="savebtn"><input type="submit" value="送信"><input type="reset" value="リセット"></p>

</div>
</form>


<script>
function check()
{
    //②次にその関数内でテキストエリアの値を取得。
    txt = document.form1.chattext.value;
    //③その後、その文字列の文字数を取得。
    n = txt.length;
    //④最後にその文字数が制限文字数以上だった場合、アラートを実行。
    if (n > 200) alert("200文字以内で入力してください");
}

function ShowLength( str ) {
	   document.getElementById("inputlength").innerHTML = str.length + "文字";
	}

</script>
<%@ include file="title.jsp" %>
<%@ include file="footer.jsp" %>
</body>
</html>
