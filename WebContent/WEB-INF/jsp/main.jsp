<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%@ page import="model.Item" %>
<%@ page import="java.util.List" %>
<%
User loginUser = (User)session.getAttribute("isLogin");
List<Item> items = (List<Item>)request.getAttribute("itemList");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品一覧</title>
<link rel="stylesheet" type="text/css" href="shop.css"/>
</head>
<body>

<h1>商品一覧</h1>
<span>
ようこそ、 <%=loginUser.getName() %>さん
<a href="/shopping-site-plan/Logout">ログアウト</a>
</span>
<div>
<form method="post" action="AddCart">

	<table border="1" style="width:400">
  	<tr>
    	<th>商品ID</th><th>商品名</th><th>価格</th><th>在庫数</th><th>数量</th><th>カートに追加</th>
  	</tr>


  <% for(Item item:items) {%>

  <tr>
  	<td><%=item.getItemId() %></td>
    <td><%=item.getItemName() %></td>
    <td><%=item.getPrice() %>円</td>
    <td><%=item.getQuantity() %></td>
	<td><select class="list" name="<%= item.getItemId()%>list">
                            <% for (int i = 0; i <= item.getQuantity(); i++) {%>
                            <option value="<%= i%>"><%= i%></option>
                            <% }%>
        </select>
    <td><button type="submit" name="itemName" value=<%=item.getItemId() %>>カートに追加</button></td>
  </tr>
  <%} %>

</table>
</form>
</div>
</body>
</html>