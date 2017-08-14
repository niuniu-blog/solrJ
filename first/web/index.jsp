<%--
  Created by IntelliJ IDEA.
  User: zhangxinqiang
  Date: 2017/8/2
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/receiveInt.do" method="post">
    <input type="submit" value="提交">
    <input name="id">
</form>
<hr/>
<form action="${pageContext.request.contextPath}/user/receiveStr.do" method="post">
    <input name="name">
    <input type="submit" value="提交">
</form>
</body>
</html>
