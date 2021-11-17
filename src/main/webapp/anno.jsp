<%--
  Created by IntelliJ IDEA.
  User: 儒雅
  Date: 2021/11/13
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="anno/requertParams?name=哈哈">requestParams注解的使用</a>
<a href="anno/PathVariable/10">pathVariable注解的使用</a>
<a href="anno/requertHeader">requertHeader注解的使用</a>
<a href="anno/CookieValue">CookieValue注解的使用</a>
<form action="anno/annotest" method="post">

    姓名：<input type="text" name="name"></br>
    密码：<input type="text" name="password"></br>
    <input type="submit" value="提交"></br>
</form>
<form action="anno/ModelAttribute" method="post">

    姓名：<input type="text" name="name"></br>
    密码：<input type="text" name="password"></br>
    <input type="submit" value="提交"></br>
</form>
<!-- SessionAttribute 注解的使用 -->
<a href="anno/testPutSession">存入 SessionAttribute</a> <hr/>
<a href="anno/testGetSession">取出 SessionAttribute</a> <hr/>
<a href="anno/testCleanSession">清除 SessionAttribute</a>
</body>
</html>
