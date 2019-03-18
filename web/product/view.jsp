<%--
  Created by IntelliJ IDEA.
  User: fpt shop 671
  Date: 13-Mar-19
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Nhasanxuat: </td>
        <td>${requestScope["product"].getNhasanxuat()}</td>
    </tr>
    <tr>
        <td>Giaca: </td>
        <td>${requestScope["product"].getGiaca()}</td>
    </tr>
</table>
</body>
</html>

