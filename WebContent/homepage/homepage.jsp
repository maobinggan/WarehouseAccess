<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登入页</title>
<style type="text/css">
	.course{
		float:left;
		width: 120px;
	}
	.course_01{
		background-image: url("..//image/bar_01.png");
		color: white;
	}
	.content{
		
	}
</style>
</head>
<body>
	<div class="course">
		<div class="course_01">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp出入库<br>
		</div>
		<img alt="" src="..//image/bar_02.gif">
		<a href="../warehouse/loadwarehouse.jsp" target="aaa">入库</a><br>
		<img alt="" src="..//image/bar_02.gif">
		<a href="../warehouse/showRukujilu.jsp" target="aaa">入库记录</a><br>
		<img alt="" src="..//image/bar_02.gif">
		<a href="../warehouse/outWarehouse.jsp" target="aaa">出库</a><br>
		<img alt="" src="..//image/bar_02.gif">
		<a href="../warehouse/showChukujilu.jsp" target="aaa">出库记录</a><br>
		<div class="course_01">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp材料管理<br>
		</div>
		<img alt="" src="..//image/bar_02.gif">
		<a href="../warehouse/showkucun.jsp" target="aaa">查看仓库</a><br>
		<img alt="" src="..//image/bar_02.gif">
		<a href="../warehouse/showCailiao.jsp" target="aaa">查看材料</a><br>
		<div class="course_01">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp员工管理<br>
		</div>
		<img alt="" src="..//image/bar_02.gif">
		<a href="../warehouse/showBumen.jsp" target="aaa">部门信息</a><br>
		<img alt="" src="..//image/bar_02.gif">
		<a href="../warehouse/showYuangong.jsp" target="aaa">员工信息</a><br>
		<img alt="" src="..//image/bar_02.gif">
		<a href="../warehouse/addYuangong.jsp" target="aaa">添加员工</a><br>
	</div>
	<div class="content">
		<iframe name="aaa"  width=1500px" height="700px" src="../homepage/indexHomepage.jsp";></iframe >
	</div>
	
	
</body>
</html>