<%--
  Created by IntelliJ IDEA.
  User: Eitrien
  Date: 2022/3/9
  Time: 上午 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
<h1>Register Page</h1>
<form method="post">
    Username: <input type="text" name="username"/><br/>
    Password: <input type="password" name="password"/><br/>
    Email: <input type="email" name="email"/><br>
    <select id="sex" name="sex">
        <option value="male">Male</option>
        <option value="female">Female</option>
    </select><br/>
    Birthdate: <input type="date" name="Birthdate" /><br/>
    <input type="submit" value="Register"/>
</form>
</body>
</html>