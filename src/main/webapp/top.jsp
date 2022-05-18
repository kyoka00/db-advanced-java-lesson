<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>演習問題14　トップ画面</title>
</head>
<body>
	<h2>＜トップ画面(top.jsp)＞</h2>
	<div style="padding: 10px; border: 3px solid #333333;">
	
	<h1>検索条件を入力してください</h1>
	
	<form action="/productServlet" method = "post">
	
		<label>product_id:</label>
		<input type= "text" name= "product_id" ><br>
		<button type= "submit">検索</button>
		
	</form>
	</div>
</body>
</html>

