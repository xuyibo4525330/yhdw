<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/27
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增门店</title>

    <style>
        body {
            font-family: 微软雅黑;
            background-color: #EDEDED;
        }

        #add_door_head {
            border-bottom: 1px solid #DCDCDC;
        }

        #add_door {
            margin: 20px auto;
            border: 1px solid #dddddd;
            border-collapse: collapse;
            border-spacing: 10px 10px;
            text-align: center;
            width: 50%;
            height: 30%;
        }

        #add_door td {
            border: 1px solid #dddddd;
        }

        input[type=text] {
            background: #EDEDED;
            border: 1px solid #999;
            width: 80%;
        }
    </style>

</head>
<body>
<div id="add_door_head">
    <h3 style="text-align: center;font-size: 10px;">新增门店</h3>
</div>
<div>
    <form action="" method="post">
        <table id="add_door">
            <tr>
                <td>门店名称</td>
                <td><input type="text" name="name" value="" placeholder="请输入门店名称"/></td>
            </tr>
            <tr>
                <td>联系电话</td>
                <td><input type="text" name="name" value="" placeholder="请输入联系电话"/></td>
            </tr>
            <tr>
                <td>门店地址</td>
                <td><input type="text" name="name" value="" placeholder="请输入门店地址"/></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center"><input type="submit"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
