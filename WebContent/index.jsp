<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ShoppingSite</title>
</head>
<body>
<div align="center">
<h1>ShoppingSiteへようこそ</h1><br/>

<form action="/shopping-site-plan/Login" method="POST">
<p>ユーザ名とパスワードを入力してください。</p><br />
ユーザ名:<input type="text" name="name"><br />
パスワード:<input type="password" name="pass"><br />
<input type="submit" value="ログイン">
</form>

<footer>
        <p class="copyright"><small>&copy; Copyright 2017 Supicule</small></p>
</footer>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/footer.css">

</div>
</body>
</html>

