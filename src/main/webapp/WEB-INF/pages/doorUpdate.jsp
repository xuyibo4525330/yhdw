<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/27
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="application/javascript">

    </script>

    <style>
        body{
            background-color: #EDEDED;
        }
        div:first-child{
            border-bottom: 1px solid #dddddd;
        }
        table{
            margin: 20px auto;
            border-collapse: collapse;
            width: 50%;
            height: 40%;
        }
        table tr td{
            text-align: center;
        }
        input{
            background: #ffffff;
            border: 1px solid #dddddd;
        }
        input[type=submit]{
            width: 20%;
        }
    </style>

</head>
<body>
<div>
    <h3 style="text-align: center">修改门店</h3>
</div>
<div>
    <form action="" method="post">
        <table border="1">
            <tr>
                <td>门店名称</td>
                <td>
                    <input type="text" value="111"/>
                </td>
            </tr>
            <tr>
                <td>联系方式</td>
                <td>
                    <input type="text" value="111"/>
                </td>
            </tr>
            <tr>
                <td>门店地址</td>
                <td>
                    <input type="text" value="111"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center">
                    <input type="submit"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
