<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ログイン画面</title>
		<link rel="stylesheet" type="text/css" href="shop.css"/>
	</head>
	<body>

		<h1>ShoppingSiteへようこそ</h1>
		<form action="/shopping-site-plan/Login" method="POST">
			<h3>ユーザIDとパスワードを入力してください。</h3>
			<p>ユーザID:<input type="text" name="id"></p>
			<p>パスワード:<input type="password" name="pass"></p>
			<p><font color="red">${ error }</font></p>
			<input type="submit" value="ログイン">
		</form>


		<!-- <footer>
        	<p><small>&copy; Copyright 2017 Spicule</small></p>
		</footer> -->

	</body>
</html>

