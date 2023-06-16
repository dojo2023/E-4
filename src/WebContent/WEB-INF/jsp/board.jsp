<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>board</title>
</head>
<body>

  <h2>掲示板</h2>
  <table border = "1">
   <tr>
      <td>ニックネーム</td>
      <td>メッセージ</td>
      <td>訪問数</td>
      <td>日付</td>
    </tr>
    <tr>
    <td><a href=""></a></td>
    <td></td>>
    </tr>
   </table>


  <form method="POST" action="<c:url value='/InsertServlet' />">
    <label for="name">名前</label><br />
    <input type="text" name="name"/>
    <br /><br />
    <label for="chattext">メッセージ</label><br />
    <textarea name="chattext"></textarea>
    <br /><br />
    <button type="submit">リセット</button>
    <button type="submit">投稿</button>
  </form>



</body>
</html>