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
		入库单<br>
	</div>
	<div  class="content">
		<form action="load.action">
			选择仓库:   <select name="cangku">
						  <option value="nothing">请选择仓库</option>
						  <option value="一号仓库">一号仓库</option>
						  <option value="二号仓库">二号仓库</option>
					  </select><br>
			选择进货材料:<select name="cailiao">
						  <option value="nothing">请选择材料类别</option>
						  <option value="水果">水果</option>
						  <option value="滑板鞋">滑板鞋</option>
						  <option value="儿童玩具">儿童玩具</option>
					  </select><br>
			供货单位:	  <select name="gonghuodanwei">
						  <option value="nothing">请选择供货商</option>
						  <option value="淘宝商城">淘宝商城</option>
						  <option value="苏宁易购">苏宁易购</option>
					  </select><br>
			进价:		<input type="text" name="purchaseprice"><br>
			数量:		<input type="text" name="number"><br>
			审查人:	<input type="text" name="examiner"size="18"><br>
			备注:		<input type="text" name="remarks"><br>
			<input type="submit" value="提交">
		</form>
	</div>
</body>
</html>