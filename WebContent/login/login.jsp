<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登入页</title>
<style type="text/css">
<%-- 
	定义css名字
	.name  使用：class=name
	定义css的ID
	#id    使用：is="id"
--%>
	.total{
		background-image:url("../image/background_01.jpg");
	}
	.title{
		font-size: 50px;
		text-align: center;
	}
	.body{
		margin-top:50px;
		font-size: 20px;
		text-align: center;
	}
</style>
</head>
<body class="total">
	<div class="title">仓库管理系统</div>
	<div class="body">
		<form action="login.action">
			用户名:	<input type="text" name="username"><br>
			密&nbsp;&nbsp;&nbsp;&nbsp;码:	<input type="password" name="password"><br>
					<input type="submit" value="登入">
		</form>
		<a href="register.action">注册</a>
	</div>
</body>
</html>