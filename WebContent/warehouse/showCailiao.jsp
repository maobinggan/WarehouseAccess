<%@page import="com.hy.bean.CailiaoBean"%>
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
	<div class="tabletitle">材料详情<br><br>
	</div>
	<table border="1" cellspacing="0" align="center">
		<tr bgcolor="#9B30FF" class="teblecontent01">
			<td>材料编号</td>
			<td>所在仓库</td>
			<td>材料类型</td>
			<td>入库日期</td>
		</tr>
	<%
		List<CailiaoBean> cailiaobiao=(List<CailiaoBean>)request.getSession().getAttribute("cailiaobiao");
	%>
	<%
		for(int i=0;i<cailiaobiao.size();i++){
	%>
		<tr class="teblecontent03">
			<td><%=cailiaobiao.get(i).getCailiaoID() %></td>
			<td><%=cailiaobiao.get(i).getCangku() %></td>
			<td><%=cailiaobiao.get(i).getCailiao() %></td>
			<td><%=cailiaobiao.get(i).getDate() %></td>
		</tr>
	<% 
		}
	%>
	</table>
</body>
</html>