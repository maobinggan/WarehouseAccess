<%@page import="com.hy.bean.YuangongBean"%>
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
		background-image: url("../image/background_01.jpg");
	}
	.tabletitle{
		text-align:center;
		font-size: 30px;
	}
	.teblecontent01{
		font-size: 20px;
	}
	.teblecontent02{
		color:red;
		font-size: 14px;
	}
	.teblecontent03{
		font-size: 14px;
	}
</style>
</head>
<body class="total">
	<div class="tabletitle">员工信息<br><br>
	</div>
	<table border="1" cellspacing="0" align="center">
		<tr bgcolor="#9B30FF" class="teblecontent01">
			<td>员工编号</td>
			<td>姓名</td>
			<td>所属部门</td>
			<td>电话</td>
			<td>操作</td>
		</tr>
	<%
		String deleteID=request.getParameter("target");
		System.out.println(deleteID);
		if(deleteID!=null){
			DaoLmpl.deleteYuangong(deleteID);
		}
		List<YuangongBean> yuangongbiao=DaoLmpl.getYuangongbiao();
	%>
	<%
		for(int i=0;i<yuangongbiao.size();i++){
	%>
		<tr class="teblecontent03">
			<td><%=yuangongbiao.get(i).getYuangongID() %></td>
			<td><%=yuangongbiao.get(i).getYuangongname()%></td>
			<td><%=yuangongbiao.get(i).getBumenname() %></td>
			<td><%=yuangongbiao.get(i).getPhone() %></td>
			<td>
				<form action="showYuangong.jsp" name="f<%=yuangongbiao.get(i).getYuangongID() %>">
					<input type="hidden" name="target" value="<%=yuangongbiao.get(i).getYuangongID() %>">
					<a href='javascript:document.f<%=yuangongbiao.get(i).getYuangongID() %>.submit();'>删除</a> 
				</form>
			
			</td>
		</tr>
	<% 
		}
	%>
	</table>
</body>
</html>