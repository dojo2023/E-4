<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スライドショー画面</title>
<link rel="stylesheet" type="text/css" href="/sobaudon/css/slide.css">
<link rel="stylesheet" type="text/css" href="/sobaudon/css/header.css">
<link rel="stylesheet" type="text/css" href="/sobaudon/css/title.css">
</head>
<body>
<a href="/sobaudon/RegistrationServlet" style="padding-bottom:0;">
  <img src="/img/logo.png" style="width:100px" />
</a>
<div class="position">
  <div>写真の日付</div>
  <div class="achievement">称号（right: 0;）</div>
</div>
<article>
  <div class="advertisement"><img src="./img/advertisement.png"></div>
  <div class="slider">
        <div class="slider-inner">
        <c:forEach var="e" items="${manageSlideList}" >
           <div class="slider-item"><img src="${e.picture}"></div>
            </c:forEach>
        </div>
  <div class="button1" style="height:400px;">
    <button>開始</button>
  </div>
  </div>
</article>
</body>
</html>