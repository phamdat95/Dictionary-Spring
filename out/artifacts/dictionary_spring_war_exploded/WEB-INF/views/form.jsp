<%--
  Created by IntelliJ IDEA.
  User: Pham Dat
  Date: 12/5/2018
  Time: 7:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>Dictionary</h1>
<form method="post">
<table>
    <tr>
        <td>Vietnamese</td>
        <td></td>
        <td>English</td>
    </tr>
    <tr>
        <td><input type="text" name="vn" value="${search}"></td>
        <td><button type="submit">Translate</button></td>
        <td>${result}</td>
    </tr>
</table>
</form>
</body>
</html>
