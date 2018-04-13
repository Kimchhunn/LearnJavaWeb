<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <%
    Integer counter = (Integer) session.getAttribute("counter");
    if (counter ==  null || counter == 0) {
        counter = 1;
    }
    else {
        counter++;
    }
    out.println(counter);
    session.setAttribute("counter", counter);
  %>

  </body>
</html>