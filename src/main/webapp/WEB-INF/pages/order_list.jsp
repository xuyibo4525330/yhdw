<%@ page pageEncoding="utf-8"%>
<%-- 引入JSTL标签库 --%>
<%@ taglib prefix="c" 
	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" 
	uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
<head>
<title>订单管理</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<style type="text/css">
	body{ font-family: "微软雅黑"; background-color: #EDEDED; }
	h2{ text-align: center;}
	table{ width:96%; margin: 0 auto; text-align: center; border-collapse:collapse; font-size:16px;}
	td, th{ padding: 5px;}
	th{ background-color: #DCDCDC; width:120px; }
	th.width-40{ width: 40px; }
	th.width-50{ width: 50px; }
	th.width-64{ width: 64px; }
	th.width-80{ width: 80px; }
	th.width-120{ width: 100px; }
	hr{ margin-bottom:20px; border:1px solid #aaa; }
	#add-order{text-align:center;font-size:20px;}
</style>
	
<script type="text/javascript">
	
</script>
</head>
<body>
	<h2>订单管理</h2>
	<div id="add-order">
		<a href="findAllDoorToOrder_add" target="rightFrame">新增订单</a>
	</div>
	<hr/>
	<table border="1">
		<tr>
			<th class="width-40">序号</th>
			<th class="width-120">所属门店</th>
			<th class="width-50">订单号</th>
			<th class="width-40">类型</th>
			<th class="width-40">人数</th>
			<th class="width-50">收银员</th>
			<th class="width-120">下单时间</th>
			<th class="width-120">结账时间</th>
			<th class="width-50">支付方式</th>
			<th class="width-50">金额</th>
			<th class="width-80">操 作</th>
		</tr>

	<!-- 模版数据 -->
	<tr>
			<td>1</td>
			<td>永和大王(西直门店)</td>
			<td>P001</td>
			<td>堂食</td>
			<td>1</td>
			<td>张三</td>
			<td>
				2018-04-26 14:49:07
				<%-- 
				<fmt:formatDate value="${order.orderTime}"
							pattern="yyyy-MM-dd HH:mm:ss" />
				 --%>
			</td>
			<td>
				2018-04-26 14:49:07
			</td>
			<td>微支付</td>
			<td>16.0</td>
			<td>
				<a href="orderDelete?id=">删除</a>
				&nbsp;|&nbsp;
				<a href="orderInfo?id=">修改</a>
			</td>
		</tr>
</table>

</body><!-- body-end  -->
</html>



