<%@page import="javassist.bytecode.stackmap.BasicBlock.Catch"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.hy.dao.DaoLmpl"%>
<%@page import="com.hy.bean.BumenBean"%>
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
	<div class="tabletitle">部门信息<br><br>
	</div>
	<table border="1" cellspacing="0" align="center">
		<tr bgcolor="#9B30FF" class="teblecontent01">
			<td>部门编号</td>
			<td>部门名称</td>
			<td>部门 经理</td>
			<td>部门电话</td>
		</tr>
	<%
		List<BumenBean> bumenbiao=DaoLmpl.getBumenbiao();
	%>
	<%
		for(int i=0;i<bumenbiao.size();i++){
	%>
		<tr class="teblecontent03">
			<td><%=bumenbiao.get(i).getBumenID() %></td>
			<td><%=bumenbiao.get(i).getBumenname()%></td>
			<td><%=bumenbiao.get(i).getBumenjingli() %></td>
			<td><%=bumenbiao.get(i).getPhone() %></td>
		</tr>
	<% 
		}
	%>
	</table>
</body>
</html>