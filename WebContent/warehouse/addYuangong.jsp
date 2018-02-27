<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登入页</title>
<style type="text/css">
	.total{
		background-image: url("../image/background_03.jpg");
	}
	.title{
		font-size: 40px;
		text-align: center;
	}
	.content{
		margin-top:20px;
		font-size: 15px;
		text-align: center;
	}
</style>
</head>
<body class="total">
	<div class="title">
		添加员工<br>
	</div>
	<div  class="content">
		<form action="addingYuangong.action">
			员工号:	<input type="text" name="yuangongID"><br>
			姓名:	<input type="text" name="yuangongname"><br>
			部门:	<input type="text" name="bumenname"size="18"><br>
			手机号:		<input type="text" name="phone"><br>
			<input type="submit" value="提交">
		</form>
	</div>
</body>
</html>