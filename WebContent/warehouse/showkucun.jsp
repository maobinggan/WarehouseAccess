<%@page import="com.hy.bean.KucunBean"%>
<%@page import="com.hy.bean.RukujiluBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登入页</title>
<style type="text/css">
	.total{
		background-image: url("../image/background_02.jpg");
	}
	.tabletitle{
		color:white;
		text-align:center;
		font-size: 30px;
	}
	.teblecontent01{
		color:white;
		font-size: 20px;
	}
	.teblecontent02{
		color:red;
		font-size: 14px;
	}
	.teblecontent03{
		color:white;
		font-size: 14px;
	}
</style>
</head>
<body class="total">
	<div class="tabletitle">库存<br><br>
	</div>
	<table border="1" cellspacing="0" align="center">
		<tr bgcolor="#9B30FF" class="teblecontent01">
			<td>仓库</td>
			<td>材料类别</td>
			<td>最近操作时间</td>
			<td>剩余数量</td>
		</tr>
	<%
		List<KucunBean> kucun=(List<KucunBean>)request.getSession().getAttribute("kucun");
	%>
	<%
		for(int i=0;i<kucun.size();i++){
	%>
		<tr class="teblecontent03">
			<td><%=kucun.get(i).getCangku() %></td>
			<td><%=kucun.get(i).getCailiao()  %></td>
			<td><%=kucun.get(i).getDate()%></td>
			<td><%=kucun.get(i).getNumber()%></td>
		</tr>

	<% 
		}
	%>
	</table>
</body>
</html>