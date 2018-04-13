<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  //Maintain counter based browser
  <%
    Integer counter_browser = (Integer) session.getAttribute("counter");
    if (counter_browser ==  null || counter_browser == 0) {
      counter_browser = 1;
    }
    else {
      counter_browser++;
    }
    out.println(counter_browser);
    session.setAttribute("counter_browser", counter_browser);
  %>
  //
  <%
    Integer counter_user = (Integer) application.getAttribute("counter");
    if (counter_user ==  null || counter_user == 0) {
      counter_user = 1;
    }
    else {
      counter_user++;
    }
    out.println(counter_user);
    session.setAttribute("counter_application", counter_user);
  %>

  </body>
</html>