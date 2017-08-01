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
<title>ShoppingSite</title>
</head>
<body>
<h2>買い物ページ</h2>
<p>
ようこそ、<%= loginUser.getName() %>さん
<a href="/shopping-site-plan/Logout">ログアウト</a>
</p>
<form method="post" action="BuyItem">
<table border="1" style="width:400">
  <tr>
    <th>商品ID</th><th>写真</th><th>商品名</th><th>値段</th>
  </tr>
  <tr>
  	<td>1</td>
    <td><img src="images/ringo.jpg" width="263" height="198"></td>
    <td>りんご</td>
    <td>178円</td>
    <th><button type="submit" name="productName" value="りんご">購入</button></th>
  </tr>
  <tr>
  	<td>2</td>
    <td><img src="images/banana.jpg" width="198" height="133"></td>
    <td>バナナ</td>
    <td>130円</td>
    <th><button type="submit" name="productName" value="バナナ">購入</button></th>
  </tr>
</table>
</form>
</body>
</html>