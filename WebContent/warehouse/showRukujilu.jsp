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
	<div class="tabletitle">入库记录<br><br>
	</div>
	<table border="1" cellspacing="0" align="center">
		<tr bgcolor="#9B30FF" class="teblecontent01">
			<td>所在仓库</td>
			<td>材料类别</td>
			<td>供货单位</td>
			<td>单价/元</td>
			<td>入库数量</td>
			<td>日期</td>
			<td>检察员</td>
		</tr>
	<%
		List<RukujiluBean> rukujilu=(List<RukujiluBean>)request.getSession().getAttribute("rukujilu");
	%>
	<%
		for(int i=0;i<rukujilu.size();i++){
			if(i==0){
	%>
		<tr class="teblecontent02">
			<td><%=rukujilu.get(i).getCangku() %></td>
			<td><%=rukujilu.get(i).getCailiao() %></td>
			<td><%=rukujilu.get(i).getGonghuodanwei() %></td>
			<td><%=rukujilu.get(i).getPurchaseprise() %></td>
			<td><%=rukujilu.get(i).getNumber()%></td>
			<td><%=rukujilu.get(i).getDate() %></td>
			<td><%=rukujilu.get(i).getExaminer() %></td>
		</tr>
	<% 
			}else {
				
	%>
		<tr class="teblecontent03">
			<td><%=rukujilu.get(i).getCangku() %></td>
			<td><%=rukujilu.get(i).getCailiao() %></td>
			<td><%=rukujilu.get(i).getGonghuodanwei() %></td>
			<td><%=rukujilu.get(i).getPurchaseprise() %></td>
			<td><%=rukujilu.get(i).getNumber()%></td>
			<td><%=rukujilu.get(i).getDate() %></td>
			<td><%=rukujilu.get(i).getExaminer() %></td>
		</tr>
	<% 
			}
		}
	%>
	</table>
</body>
</html>