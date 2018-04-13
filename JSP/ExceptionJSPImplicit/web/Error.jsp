<%--
  Created by IntelliJ IDEA.
  User: chhun
  Date: 2/9/2018
  Time: 8:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@page isErrorPage="true"  %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1> Exception Occured During Processing....</h1>
    <%= exception.getMessage() %> <br>
    <%= exception %>
</body>
</html>
