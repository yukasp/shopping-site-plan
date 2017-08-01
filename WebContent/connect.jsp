<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*,javax.naming.*,javax.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>データベースへの接続</title>
</head>
<body>
<%
InitialContext context = new InitialContext();
DataSource ds = (DataSource)context.lookup("java:comp/env/shoppingsite");

if (ds != null) {
  System.out.println("データ取得できたー！");

}

%>

</body>
</html>