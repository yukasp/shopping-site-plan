<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%@ page import="model.Product" %>
<%

User loginUser = (User)session.getAttribute("loginUser");
Product product = (Product)session.getAttribute("Product");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>買い物かご</title>
</head>
<body>
<h2><%= loginUser.getName() %>さんのカート</h2>
<%= product.getName() %>
<form method="post" action="ResultLogic">
<input type="submit" value="購入" />
</form>
</body>
</html>