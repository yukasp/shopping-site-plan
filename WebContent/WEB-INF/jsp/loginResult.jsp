<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
User loginUser = (User)session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ShoppingSite-Login</title>
</head>
<body>
<% if(loginUser != null) { %>
	<p>ようこそ<%= loginUser.getName() %>さん</p>
	<a href="/shopping-site-plan/Main">商品一覧へ</a>
<% } else { %>
	<p>ログインに失敗しました</p>
	<a href="/shopping-site-plan/">topへ</a>
<% } %>
</body>
</html>