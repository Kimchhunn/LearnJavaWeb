<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <form action="Validate.jsp">
      Number : 1 <input type="text" name="num1">
      Number : 2 <input type="text" name="num2">
      <input type="submit" value="Click Here To See NumberFormat Exception">
    </form>
    <form action="Validate.jsp">
      Number : 3 <input type="text" name="num3">
      Number : 4 <input type="text" name="num4">
      <input type="submit" value="Click Here To See NullPoint Exception">
    </form>
    <form action="Validate.jsp">
      Number : 5 <input type="text" name="num5">
      Number : 6 <input type="text" name="num6">
      <input type="submit" value="Click Here To See ArrayOutOfBound Exception">
    </form>

  </body>
</html>