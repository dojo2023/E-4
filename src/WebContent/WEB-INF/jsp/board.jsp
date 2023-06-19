<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>board</title>
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
      <li><a href="/sovaudon/RegistrationServlet">登録</a></li>
      <li><a href="/sobaudon/CalendarServlet">カレンダー</a></li>
      <li><a href="/sobaudon/SlideServlet">スライドショー</a></li>
      <li><a href="/sobaudon/BoardServlet">掲示板</a></li>
      <li><a href="/sobaudon/HelpServlet">ヘルプ</a></li>
      <li><a href="/sobaudon/ProfileServlet">プロフィール</a></li>
    </ul>
  <!-- ヘッダー（ここまで） -->
  </header>

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


  <form method="POST" action="<c:url value='/BoardServlet' />">
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