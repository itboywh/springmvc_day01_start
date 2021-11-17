<%--
  Created by IntelliJ IDEA.
  User: 儒雅
  Date: 2021/11/13
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--把数据提交到accoutn
<form action="param/formtest" method="post">--%>
    <%--姓名：<input type="text" name="name"></br>--%>
    <%--密码：<input type="text" name="password"></br>--%>
    <%--金额：<input type="text" name="money"></br>--%>
    <%--年龄：<input type="text" name="user.age"></br>--%>
    <%--性别：<input type="text" name="user.sex"></br>--%>
    <%--<input type="submit" value="提交"></br>--%>
<%--</form>--%>
<%--集合--%>
<form action="param/formtest" method="post">
    姓名：<input type="text" name="name"></br>
    密码：<input type="text" name="password"></br>
    金额：<input type="text" name="money"></br>
    年龄：<input type="text" name="users[0].age"></br>
    性别：<input type="text" name="users[0].sex"></br>

    性别：<input type="text" name="userMap['one'].sex"></br>
    年龄：<input type="text" name="userMap['one'].age"></br>
    <input type="submit" value="提交"></br>
</form>
</body>
</html>
