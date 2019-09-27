<%@ page pageEncoding="utf-8" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="static\font-awesome-4.7.0\css\font-awesome.min.css">

    <style>
        body{
            background-color: #222D32;
        }
        .menu-bar{
            font-size: 20px;
            border-bottom: 1px solid #EDEDED;
            height: 40px;
            line-height: 40px;
            text-indent: 10px;
            letter-spacing: 3px;
        }
        .menu-bar:first-child{
            border-bottom: 1px solid #EDEDED;
        }
        .menu-bar:hover{
            background-color: #EDEDED;
        }
        /*取消下划线*/
        .menu-bar a{
            color: white;
            text-decoration:none;
        }
    </style>

</head>
<body>
<div class="menu-bar">
    <a href="doorList" target="rightFrame"><i class="fa fa-1x fa-university" aria-hidden="true" style=""></i>门店管理</a>
</div>
<div class="menu-bar">

    <a href="orderList" target="rightFrame"><i class="fa fa-1x fa-first-order" aria-hidden="true"></i> 订单管理</a>
</div>
<div class="menu-bar">

    <a href="door_list" target="rightFrame"><i class="fa fa-1x fa-bar-chart" aria-hidden="true" style="color:white;text-align: left"></i> 商品管理</a>
</div>
</body>
</html>