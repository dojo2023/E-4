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
  <table border="1">
    <tbody>
      <tr>
        <th>id</th>
        <th>名前</th>
        <th>メッセージ</th>
      </tr>
      <c:forEach var="message" items="${list}" varStatus="status">
        <tr>
          <td><c:out value="${message.user_id}" /></td>
          <td><c:out value="${message.name}" /></td>
          <td><textarea><c:out value="${message.chattext}" /></textarea></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  <br /><br />

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